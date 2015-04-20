package navsets;
import java.util.TreeSet;
import java.util.NavigableSet;
import java.util.SortedSet;

class TreeSetTest{
    public static void main (String ... args){
        TreeSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(100);
        sortedSet.add(89);
        sortedSet.add(77);
        sortedSet.add(51);
        sortedSet.add(40);
        System.out.println("sortedSet:" +sortedSet);

        NavigableSet<Integer> subset = new TreeSet<>();
        subset = sortedSet.subSet(51,true,89,true); // after Java 6
        System.out.println("subset:" + subset);
        
        SortedSet<Integer> subset2 = new TreeSet<>();
        subset2 = sortedSet.subSet(51,89); // existed befor Java 6
        System.out.println("subset2:" + subset2);

        NavigableSet<Integer> subset3 = new TreeSet<>();
        subset3 = sortedSet.headSet(51,true); // after Java 6
        System.out.println("subset3:" + subset3);
                
        SortedSet<Integer> subset4 = new TreeSet<>();
        subset4 = sortedSet.headSet(51); // existed befor Java 6
        System.out.println("subset4:" + subset4);

        NavigableSet<Integer> subset5 = new TreeSet<>();
        subset5 = sortedSet.tailSet(89,false); // after Java 6
        System.out.println("subset5:" + subset5);
                
        SortedSet<Integer> subset6 = new TreeSet<>();
        subset6 = sortedSet.tailSet(89); // existed befor Java 6
        System.out.println("subset6:" + subset6);

        Integer polledInt = subset.pollFirst();
        System.out.printf("polled Integer:%d\n",polledInt);
        // would be polled from both collections sortedset and subset(which is the backed collection)
        System.out.println("subset:" + subset);
        System.out.println("sortedSet:" + sortedSet);
        
        Integer polledInt2 = sortedSet.pollFirst();
        System.out.printf("polled Integer:%d\n",polledInt2);
        // would be polled from only from sortedset (because it doesnt exist in the backed collection)
        System.out.println("subset:" + subset);
        System.out.println("sortedSet:" + sortedSet);
        
    }
}
