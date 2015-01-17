package exceptions;
import java.io.*;

public class TestSuppressedException2{
    public static void main(String...args){
	try(One one = new One();Two two = new Two();){
	    System.out.println("In Try");
	}catch(Exception e){    
	    System.out.println("In Catch");
	    System.out.println(e.getMessage());// Closing of two becomes the main exception
	    for(Throwable t:e.getSuppressed()){
	    	System.out.println(t.getMessage());// Closing of one becomes its only suppressed exception
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
