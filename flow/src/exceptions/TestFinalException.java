package exceptions;
import java.io.*;
public class FinalException{
    public static void main(String ... args){
	try{
	    throw new IOException();
	}catch(final IOException e){
	    e = new IOException(); // fuck off :)   
	}catch(RuntimeException e){
	    e = new RuntimeException(); // no problem not declared as final
	}
    }
}
