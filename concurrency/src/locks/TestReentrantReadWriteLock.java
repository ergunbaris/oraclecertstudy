package locks;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class TestReentrantReadWriteLock{
    public static void main(String...args)throws Exception{
        MaxValueCollection mvc = new MaxValueCollection();
        Reader reader = new Reader(mvc);
        Writer writer= new Writer(mvc);
        Thread t1 = new Thread(writer);
        Thread.sleep(500);
        Thread t2 = new Thread(reader);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            
        }
        
        System.out.println("main ends");
        
    }
}

class Reader implements Runnable{
    private final MaxValueCollection maxValueCollection;
    public Reader(MaxValueCollection maxValueCollection){
        this.maxValueCollection = maxValueCollection;
    }
    public void run(){
        for(int i =0;i<100;i++){
            System.out.printf("Max is:%d\n",this.maxValueCollection.findMax());
            try{
                Thread.sleep(50);
            }catch(InterruptedException e){
            }
        }          
    }
}
class Writer implements Runnable{
    private final MaxValueCollection maxValueCollection;
    public Writer(MaxValueCollection maxValueCollection){
        this.maxValueCollection = maxValueCollection;
    }
    public void run(){
        for(int i =0;i<100;i++){
            this.maxValueCollection.add(i);
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
            }
        }          
    }
}
class MaxValueCollection{
    private List<Integer> integers = new ArrayList<>();
    private ReentrantReadWriteLock rw1 = new ReentrantReadWriteLock();

    public void add(Integer i){
        rw1.writeLock().lock();
        try{
            integers.add(i);
        }finally{
            rw1.writeLock().unlock();
        }
    }
    
    public int findMax(){
        rw1.readLock().lock();
        try{
            if(integers.size() > 0)
                return Collections.max(integers);
            else
                return -1;
        }
        finally{
            rw1.readLock().unlock();
        }
    }
}
