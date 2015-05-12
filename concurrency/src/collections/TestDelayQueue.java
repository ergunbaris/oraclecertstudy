package collections;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class TestDelayQueue{
    private final DelayQueue<Message> dQueue = new DelayQueue<>();
    public static void main(String...args){
        TestDelayQueue test = new TestDelayQueue();
               
        Writer tWriter = new Writer(test.dQueue);
        Reader tReader = new Reader(test.dQueue);
        Thread t1 = new Thread(tWriter);
        Thread t3 = new Thread(tReader);

        t1.start();
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
            }
        t3.start();
        try{
            t1.join();
            t3.join();
        }catch(InterruptedException e){
        }

    }
}
class Writer implements Runnable{
    private final DelayQueue<Message> delayQ;
    public Writer(DelayQueue<Message> delayQ){
        this.delayQ = delayQ;
    }
    public void run(){
        for(int i=0; i<5;i++){            
            this.delayQ.put(new Message("bobo" + i, i*1500));
        }
        System.out.println("Writer ends");
    }
}
class Reader implements Runnable{
    private final DelayQueue<Message> delayQ;
    public Reader(DelayQueue<Message> delayQ){
        this.delayQ = delayQ;
    }
    public void run(){
        for(int i=0; i<5;i++){
            try{
                System.out.printf("%s,",delayQ.take());
            }catch(InterruptedException e){
            }
        }           
        System.out.println("Reader ends");

    }
}

class Message implements Delayed{
    private final String message;
    private final long startTime;
    Message(String message, long delay){
        this.message = message;
        this.startTime = System.currentTimeMillis() + delay;
    }
    
    public long getDelay(TimeUnit unit){
        long diff = startTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);

    }
    
    public String toString(){
        return this.message;
    }
    public int compareTo(Delayed other){
        long thisDelay = this.getDelay(TimeUnit.NANOSECONDS);
        long otherDelay = other.getDelay(TimeUnit.NANOSECONDS);
        if(thisDelay > otherDelay){
            return 1;
        }else if(thisDelay < otherDelay){
            return -1;
        }
        return 0;
    
    }
        
}
