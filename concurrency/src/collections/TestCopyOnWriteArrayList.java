package collections;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;
import java.util.Iterator;

public class TestCopyOnWriteArrayList{
    private final List<Integer> intList = new CopyOnWriteArrayList<>();
    public static void main (String...args){
        TestCopyOnWriteArrayList test = new TestCopyOnWriteArrayList();
        Writer tWriter = new Writer(test.intList);   
        Writer tWriter2 = new Writer(test.intList);   
        Reader tReader = new Reader(test.intList);
        Thread t1 = new Thread(tWriter);
        Thread t2 = new Thread(tWriter2);
        Thread t3 = new Thread(tReader);

        t1.start();
        t2.start();
        t3.start();

        try{
            t1.join();
            t2.join();
            t3.join();
        }catch(InterruptedException e){
        }
        
    }

}

class Writer implements Runnable{
    private final List<Integer> intList;
    public Writer(List<Integer> intList){
        this.intList = intList;
    }
    public void run(){
        for(int i=0; i<25;i++){
            intList.add(i);
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
            }
        }
    }    
}
class Reader implements Runnable{
    private final List<Integer> intList;
    public Reader(List<Integer> intList){
        this.intList = intList;
    }
    public void run(){
        while(intList.size() <50){            
            for(Integer found:this.intList){// wont change during iteration
                System.out.printf("%d,",found);
            }
            Iterator<Integer> listIter = intList.iterator();
            while(listIter.hasNext()){
                // listIter.remove();
                // dont this is not supported on a immutable nature of CopyOnWriteArrayList
            }
            System.out.println();
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){
            }

        }
    }    
}
