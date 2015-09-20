package colls;
import java.util.*;

public class TestCollectionDeclarations{
    public static void main (String ... args){
        Map<?,?> list1 = new HashMap<Object,Object>();
        Map<?,?> list2 = new HashMap<>();
        Map<String,Object> list3 = new HashMap();
        Map<?,?> list5 = new HashMap<?,?>();
        Map list4 = new HashMap();
        list4 = list1;
            

    }
}
