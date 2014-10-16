package staticimport;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.System.out;

public class AmbigiousStaticImport {

    public static void main(String[] args) {
	out.println(MAX_VALUE);
	System.out.println("This doesnt compile because of ambiguity");
    }
    
}

