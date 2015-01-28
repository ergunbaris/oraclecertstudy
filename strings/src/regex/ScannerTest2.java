package regex;
import java.util.Scanner;

public class ScannerTest2{
    public static void main(String...args){
	    String input = "1 3 a 234 3 5";
	    Scanner s = new Scanner(input);
	    while(s.hasNext()){
		if(s.hasNextInt()){
		    int token = s.nextInt();
	            System.out.println("found "+token);		
		}else{
		   s.next();
		}
	    }
	
    }
}
