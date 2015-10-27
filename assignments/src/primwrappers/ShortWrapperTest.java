package primwrappers;
import java.util.*;

public class ShortWrapperTest{
    public static void main (String ... args){
        Set<Short> shortSet = new HashSet<>();
        short k = 1;
        shortSet.add(k);
        shortSet.remove(k+0);
        System.out.println(shortSet.size());
        
    }
}
