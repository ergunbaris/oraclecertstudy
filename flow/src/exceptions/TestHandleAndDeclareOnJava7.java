package exceptions;
import java.io.*;
import java.sql.*;
public class TestHandleAndDeclareOnJava7{
    public static void main(String...args) throws IOException,SQLException{
	try{
	    new SampleClass().sampleMethod();
	    throw new RuntimeException("deneme");
	}catch(Exception e){// not multicatch but seems like a general catch
	    System.out.println("Eksepsiyone"+ e); //on Runtime other exceptions are also handled
	    throw e;// but this is not a general catch compiler interprets that
		    // it is either IOException or SQLException
	    // This is a convienience for compile time in order to be able to 
	    // handle and throw multiple exceptions with general Exception
	    // and the throw is translated by the compiler to be all possible
	    // exceptions from called methods.
	}
    }
}

class SampleClass{
    public void sampleMethod() throws IOException,SQLException{}
}
