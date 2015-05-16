package forkjoin;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ForkJoinPool;


public class TestForkJoinPool{
    public static void main(String...args){
        final int dataLength = 1000000000;
        int data[] = new int[dataLength];
        for(int i =0; i<dataLength; i++){
            data[i] = ThreadLocalRandom.current().nextInt(1,dataLength);
        }
        long startTime = System.nanoTime();
        int position = 0;
        for(int i =0; i<dataLength; i++){
            if(data[i] > data[position]){
                position = i;
            }
        }
        long endTime = System.nanoTime();
        System.out.printf("found position with loop pos= %d in time = %d\n",position,endTime - startTime);

        ForkJoinPool pool = new ForkJoinPool();
        FindMaxPositionRecursiveTask task = new FindMaxPositionRecursiveTask(data,0,data.length);
        startTime = System.nanoTime();
        position = pool.invoke(task);        
        endTime = System.nanoTime();
        System.out.printf("found position with forkjoin pos= %d in time = %d\n",position,endTime - startTime);
    }
}

class FindMaxPositionRecursiveTask extends RecursiveTask<Integer>{
    public static final int THRESHOLD = 10000;
    private int [] data;
    private int start;
    private int end;

    public FindMaxPositionRecursiveTask(int [] data, int start, int end){
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute(){
        if(end-start <= THRESHOLD){
            int position = 0;
            for(int i=start; i<end;i++){
                if(data[i] > data[position])
                {
                    position = i;
                }
            }
            return position;
        }else{
            int halfWay = ((end-start)/2)+ start;
            FindMaxPositionRecursiveTask t1 = new FindMaxPositionRecursiveTask(data,start,halfWay);
            FindMaxPositionRecursiveTask t2 = new FindMaxPositionRecursiveTask(data,halfWay,end);
            t1.fork();
            int position2 = t2.compute();
            int position1 = t1.join();
            if(data[position2]> data[position1]){
                return position2;
            }else if(data[position2] < data[position1]){
                return position1;
            }else{
                return position1 < position2 ?position1:position2;
            }
        }
    }
}
