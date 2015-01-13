package exceptions;
import java.io.*;
public class TestMultiCatchException{
    public static void main(String ... args){
	try{
	    throw new IOException();
	}catch(IOException|NullPointerException e){
	    e = new IOException(); // fuck off multi-catchs are final by default :)   
	    // what do u expect? e can be any type declared in catch!
	}catch(RuntimeException e){
	    e = new RuntimeException(); // no problem not declared as final
	}
    }
}
