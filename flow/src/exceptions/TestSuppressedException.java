package exceptions;
import java.io.*;

public class TestSuppressedException{
    public static void main(String...args){
	try(One one = new One();Two two = new Two();){
	    System.out.println("In Try");
	    throw new NullPointerException("yet some other exception");
	}catch(Exception e){    
	    System.out.println("In Catch");
	    System.out.println(e.getMessage());// NullPointer becomes the main exception
	    for(Throwable t:e.getSuppressed()){
	    	System.out.println(t.getMessage());// Suppressed exceptions from closings
		// close error for two comes first because closing happens in reverse creation order
	    }
	}finally{
	    System.out.println("In Finally");
	}
	
    }
}

class One implements AutoCloseable{
    public void close() throws Exception{
	throw new IOException("one's close problem");
    }
}
class Two implements AutoCloseable{
    public void close() throws Exception{
	throw new IOException("two's close problem");
    }
}
