package colls;
import java.util.List;
import java.util.ArrayList;

public class TestRemoveFromList{
    public static void main (String ... args){
        List<String> sampleList = new ArrayList<>();
        sampleList.add("ME");
        sampleList.add("ME");
        sampleList.add("SE");
        sampleList.remove("ME"); // removes only the first occurence
        for(String s:sampleList){
            System.out.println(s);
        }
    }
}
