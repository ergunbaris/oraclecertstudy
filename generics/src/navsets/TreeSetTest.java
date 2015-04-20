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
        for(Integer found:sortedSet){
            System.out.println(found);
        }
        NavigableSet<Integer> subset = new TreeSet<>();
        subset = sortedSet.subSet(51,true,89,true); // after Java 6
        System.out.println(subset);
        
        SortedSet<Integer> subset2 = new TreeSet<>();
        subset2 = sortedSet.subSet(51,89); // existed befor Java 6
        System.out.println(subset2);

        NavigableSet<Integer> subset3 = new TreeSet<>();
        subset3 = sortedSet.headSet(51,true); // after Java 6
        System.out.println(subset3);
                
        SortedSet<Integer> subset4 = new TreeSet<>();
        subset4 = sortedSet.headSet(51); // existed befor Java 6
        System.out.println(subset4);

        NavigableSet<Integer> subset5 = new TreeSet<>();
        subset5 = sortedSet.tailSet(89,false); // after Java 6
        System.out.println(subset5);
                
        SortedSet<Integer> subset6 = new TreeSet<>();
        subset6 = sortedSet.tailSet(89); // existed befor Java 6
        System.out.println(subset6);
    }
}
