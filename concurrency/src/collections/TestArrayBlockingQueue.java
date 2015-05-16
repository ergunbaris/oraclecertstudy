package collection;
import java.util.concurrent.ArrayBlockingQueue;

public class TestArrayBlockingQueue{
    private final ArrayBlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(1);
    public static void main(String...args){
        TestArrayBlockingQueue test = new TestArrayBlockingQueue();
        Writer writer = new Writer(test.blockingQueue);
        Reader reader = new Reader(test.blockingQueue);
        
        Thread t1 = new Thread(writer);
        Thread t2 = new Thread(reader);
        
        t2.start();
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
        }            
        t1.start();

        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
        }            

        
    }    
}

class Writer implements Runnable{
    private final ArrayBlockingQueue<Integer> blockingQueue;
    public Writer(ArrayBlockingQueue<Integer> blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    public void run(){
        for(int i=0;i<5;i++){
            try{
                blockingQueue.put(i);//example of blocking method
                System.out.printf("putting %d in the queue\n",i);
                boolean accepted = blockingQueue.offer(i);
                System.out.printf("offered %d in the queue and accepted=%b\n",i,accepted);
                Thread.sleep(500);
            
            }catch(InterruptedException e){
            }            
        }
    }
}
class Reader implements Runnable{
    private final ArrayBlockingQueue<Integer> blockingQueue;
    public Reader(ArrayBlockingQueue<Integer> blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    public void run(){
        for(int i=0;i<5;i++){
            try{
                System.out.println(blockingQueue.take());//example of blocking method
                Thread.sleep(500);
            }catch(InterruptedException e){
            }            
        }
    }
}
