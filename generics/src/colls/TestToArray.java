package colls;
import java.util.List;
import java.util.ArrayList;

class TestToArray{
    public static void main (String ... args){
        List<Integer> iL = new ArrayList<>();
        for(int x=0; x < 3; x++){
            iL.add(x);
        }
        for(int found:iL){
            System.out.printf("%d,",found);
        }
        System.out.println();
        Object [] oA = iL.toArray();
        Integer [] iA = new Integer[3];
        iA = iL.toArray(new Integer[0]);
        iA[2] = 4;
        for(int found:iL){
            System.out.printf("%d,",found);
        }
        Integer [] iA2 = new Integer[3];
        iL.toArray(iA2);
        System.out.println();   
        for(Integer found:iA){
            System.out.printf("%d,",found);
        }
        System.out.println();   
        for(Integer found:iA2){
            System.out.printf("%d,",found);
        }
    
    }
}
