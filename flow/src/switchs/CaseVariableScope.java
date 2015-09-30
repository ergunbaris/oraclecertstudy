package switchs;

public class CaseVariableScope{
    public static void main (String...args){        
        switch(args[0]){
            case "boris":
                boolean b = true;
                System.out.println(b);
            break;
            case "poi":
                b = false;
                System.out.println(b);
            break;
        }
    }
}
