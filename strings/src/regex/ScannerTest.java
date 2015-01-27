package regex;
import java.util.Scanner;

public class ScannerTest{
    public static void main(String...args){
	System.out.println("input: ");
	System.out.flush();
	try{
	    Scanner s = new Scanner(System.in);
	    String token;
	    do{
		token = s.findInLine(args[0]);
	        System.out.println("found "+token);		
	    }while(token != null);
	}
	catch(Exception e){	
    	     System.out.println("scan exception ");
	}
	
    }
}
