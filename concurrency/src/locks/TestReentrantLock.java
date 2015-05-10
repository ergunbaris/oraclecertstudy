package locks;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestReentrantLock{
    public static void main(String...args){
        Work work = new Work();
        Thread t1 = new Thread(work);
        Thread t2 = new Thread(work);
        Thread t3 = new Thread(work);

        t1.start();
        t2.start();
        t3.start();

        try{
            t1.join();
            t2.join();
            t3.join();
        }catch(InterruptedException e){
            
        }
        
        System.out.println("main ends");
        
    }
}

class Work implements Runnable{
    private Lock lock = new ReentrantLock();
    public void run(){
        System.out.printf("started %s\n",Thread.currentThread().getName());
        lock.lock();
        try{ 
            System.out.printf("inside protected area %s\n",Thread.currentThread().getName());
        }finally{
            lock.unlock();
        }
        
        System.out.printf("done %s\n",Thread.currentThread().getName());
    }    
}
