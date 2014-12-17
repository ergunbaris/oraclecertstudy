package exceptions;

public class Exercise{
   public static void main(String...args){
	try{
	    System.out.println(reverse(args[0]));
	}catch(IllegalArgumentException ex){
	    System.out.println("out of bounds handled");	    
	}catch(ArrayIndexOutOfBoundsException ex){
	    System.out.println("args cannot be null or empty");	    
	}finally{
	    System.out.println("bye");		    
	}
   }
   public static String reverse(String toReverse){
	if(null == toReverse || toReverse.isEmpty()){
	    throw new IllegalArgumentException();
	}
	StringBuilder reversed = new StringBuilder("");
	for(int i=toReverse.length()-1;i>=0;i--){
	    reversed.append(toReverse.charAt(i));
	}
	return reversed.toString();
   }
}
