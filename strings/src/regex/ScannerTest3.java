package regex;
import java.util.Scanner;

public class ScannerTest3{
    public static void main(String...args){
	    String input = "1 3 a 234 3 5";
	    Scanner s = new Scanner(input);
	    while(true){
		int token = s.nextInt(); //throws java.util.InputMismatch
		System.out.println("found "+token);		
	    }
	
    }
}
