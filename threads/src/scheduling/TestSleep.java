package scheduling;

public class TestSleep{
    public static void main(String...args){        
        Thread t1 = new Thread(new Job());
        Thread t2 = new Thread(new Job());
        Thread t3 = new Thread(new Job());
        
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");
        
        t1.start();
        t2.start();
        t3.start();
    }
}

class Job implements Runnable{
    public void run(){
        for (int i=0;i<100;i++){
            String threadName = "Thread name="+ Thread.currentThread().getName();
            System.out.println(threadName + ", i=" + i );
            if(i%10 != 0){
                try{
                    Thread.sleep(100);
                }catch(InterruptedException e){
                    System.out.println(threadName + " Interrupted");
                }
            }
            if(i != 0 && i%25 == 0){
                Thread.currentThread().interrupt();
            }            
        }
    }    
}
