package console;
import java.io.Console;

public class TestConsole{
    public static void main(String...args){
        assert System.console() != null;
        Console c = System.console();
        char [] pw;
        pw = c.readPassword("%s","Enter pw:");
        for(char ch:pw){
            c.format("%c",ch);
        }
        c.format("\n");

        String name = c.readLine("%s","Enter ur name:");
        while(!name.equalsIgnoreCase("enough")){
            c.format("Entered name is:%s \n", name);
            name = c.readLine("%s","Enter ur name:");
        }
        
    }
}
