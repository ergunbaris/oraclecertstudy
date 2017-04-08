package synchronization;

public class TestWait{
    /*
    A stupid example to show how wait and notify will trigger each other
    wait actually releases the lock and puts the thread into a waiting state
    Until being notified to be rescheduled by the operating system thread scheduler.
    You may comment out one of the notifiers and run a kill -3 <pid> to see 
    how the thread state being reported by the operating system.
    Something like :

      "Thread-1" #10 prio=5 os_prio=0 tid=0x00007f1b680e0800 nid=0x5f5e in Object.wait() [0x00007f1b538f7000]
         java.lang.Thread.State: WAITING (on object monitor)
        at java.lang.Object.wait(Native Method)
        - waiting on <0x000000076d95db38> (a java.lang.StringBuffer)
        at java.lang.Object.wait(Object.java:502)
        at synchronization.ReaderThread.run(TestWait.java:66)
        - locked <0x000000076d95db38> (a java.lang.StringBuffer)
        at java.lang.Thread.run(Thread.java:745)

      "Thread-0" #9 prio=5 os_prio=0 tid=0x00007f1b680df000 nid=0x5f5d in Object.wait() [0x00007f1b539f8000]
         java.lang.Thread.State: WAITING (on object monitor)
        at java.lang.Object.wait(Native Method)
        - waiting on <0x000000076d95db38> (a java.lang.StringBuffer)
        at java.lang.Object.wait(Object.java:502)
        at synchronization.WriterThread.run(TestWait.java:40)
        - locked <0x000000076d95db38> (a java.lang.StringBuffer)
        at java.lang.Thread.run(Thread.java:745)

    */
    public static void main(String...args){
            StringBuffer strBuf = new StringBuffer("");
        
            Thread t1 = new Thread(new WriterThread(strBuf));
            Thread t2 = new Thread(new ReaderThread(strBuf));

            t1.start();
            t2.start();

            try { 
                t1.join();
                t2.join();
            }catch(InterruptedException e){
            }
    }
}

class WriterThread implements Runnable{
    private final StringBuffer strBuffer;
    public WriterThread(StringBuffer strBuffer){
        this.strBuffer = strBuffer;
    }
    public void run(){        
        for(int i=0;i<10;i++){
            synchronized(this.strBuffer){
                this.strBuffer.append(i);
                this.strBuffer.notify();
                try 
                  {
                  this.strBuffer.wait();
                  }
                catch(InterruptedException e)
                  {
                  }
            }
        }
      synchronized(this.strBuffer){
        this.strBuffer.notify();
      }
    
    }
}

class ReaderThread implements Runnable{
    private final StringBuffer strBuffer;
    public ReaderThread(StringBuffer strBuffer){
        this.strBuffer = strBuffer;
    }
    public void run(){        
        for(int i=0;i<10;i++){
            synchronized(this.strBuffer){
                System.out.println(strBuffer);
                this.strBuffer.notify();
                try 
                  {
                  this.strBuffer.wait();
                  }
                catch(InterruptedException e)
                  {
                  }
            }
        }        
    }
}
