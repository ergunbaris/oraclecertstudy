package exceptions;
public class PrintTheException{
   public static void main(String...args){
	try{
	   SomeClass.someMethod();
	}catch(MyException e){
	   System.out.println ( e);
	}
	try{
	   SomeClass.someMethod();
	}catch(MyException e){
           e.printStackTrace();
	}
   }
}

class SomeClass{
   static void someMethod() throws MyException{
	throw new MyException("exception message");
   }
}

class MyException extends Exception{
   MyException(String msg){
	super(msg);
   }
}
