package collections;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.Iterator;

public class TestConcurrentSkipListSet{
    private final ConcurrentSkipListSet<String> concSet = new ConcurrentSkipListSet<>();
    private final ConcurrentSkipListMap<String,Integer> concMap = new ConcurrentSkipListMap<>();
    public static void main(String...args){
        TestConcurrentSkipListSet testSet = new TestConcurrentSkipListSet();
        Writer tWriter = new Writer(testSet.concSet);
        Writer tWriter2 = new Writer(testSet.concSet);
        Reader tReader = new Reader(testSet.concSet);
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
        MapWriter mapWriter = new MapWriter(testSet.concMap);
        MapWriter mapWriter2 = new MapWriter(testSet.concMap);
        MapReader mapReader = new MapReader(testSet.concMap);
        Thread t1m = new Thread(mapWriter);
        Thread t2m = new Thread(mapWriter2);
        Thread t3m = new Thread(mapReader);

        t1m.start();
        t2m.start();
        t3m.start();

        try{
            t1m.join();
            t2m.join();
            t3m.join();
        }catch(InterruptedException e){
        }

        
    }
}

class Writer implements Runnable{
    private final ConcurrentSkipListSet<String> concSet;
    public Writer(ConcurrentSkipListSet<String> concSet){
        this.concSet = concSet;
    }
    public void run(){
        for(int i=0; i<100;i++){
            this.concSet.add("bobo" + i);
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
            }
        }
    }
}
class Reader implements Runnable{
    private final ConcurrentSkipListSet<String> concSet;
    public Reader(ConcurrentSkipListSet<String> concSet){
        this.concSet = concSet;
    }
    public void run(){
        Iterator<String> setIter = concSet.iterator();
        while(setIter.hasNext()){
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){
            }
            String found = setIter.next();
            System.out.printf("%s,%d-",found, concSet.size());
            setIter.remove();
            if(concSet.size()>25){
                break;
            }
        }
        System.out.println();

    }
}
class MapWriter implements Runnable{
    private final ConcurrentSkipListMap<String,Integer> concMap;
    public MapWriter(ConcurrentSkipListMap<String,Integer> concMap){
        this.concMap = concMap;
    }
    public void run(){
        for(int i=0; i<100;i++){
            this.concMap.putIfAbsent("bobo" + i,i);
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
            }
        }
    }
}
class MapReader implements Runnable{
    private final ConcurrentSkipListMap<String,Integer> concMap;
    public MapReader(ConcurrentSkipListMap<String,Integer> concMap){
        this.concMap = concMap;
    }
    public void run(){
        Iterator<String> setIter = concMap.keySet().iterator();
        while(setIter.hasNext()){
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){
            }
            String found = setIter.next();
            System.out.printf("%s,%d-",found, concMap.size());
            setIter.remove();
            if(concMap.size()>25){
                break;
            }
        }
        System.out.println();

    }
}
