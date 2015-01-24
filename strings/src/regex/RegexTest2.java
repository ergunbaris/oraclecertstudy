package regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegexTest2{
    public static void main(String...args){
	if(args.length != 2){
	    throw new IllegalArgumentException("there must be two arguments");
	}
	String source = args[1];
	String expression = args[0];
	Pattern p = Pattern.compile(args[0]);
	Matcher m = p.matcher(args[1]);
	System.out.println("\nsource: " + source);
	System.out.println(" index: 01234567890123456");
	System.out.println("\nexpression: " + m.pattern());
	System.out.print("match positions: ");
	while(m.find()){	    
  	    System.out.println("on index:" + m.start() + " there is a match:" + m.group());
	}
	System.out.println();
	
    }
}
