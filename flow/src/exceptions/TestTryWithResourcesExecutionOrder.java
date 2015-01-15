package exceptions;
import java.io.Closeable;
import java.io.IOException;

public class TestTryWithResourcesExecutionOrder{
    public static void main(String...args) throws Exception{
	try(SomeClassToClose s1 = new SomeClassToClose();// must be a Closable or Autocloseable type declaration
	    Closeable s2 = s1.giveInternalResource()){ // method can be used to assign object to declaration
	    System.out.println("Try");
	}
	
    }
}
class SomeClassToClose implements AutoCloseable{
    @Override
    public void close() throws Exception{
	System.out.println("SomeClassToClose closes");
	// throw new InterruptedException(); avoid throwing this exception
	// This exception interacts with a thread's interrupted status, 
	// and runtime misbehavior is likely to occur if an InterruptedException is suppressed.
	// More generally, if it would cause problems for an exception to be suppressed, 
	// the AutoCloseable.close method should not throw it.
    }
    public SomeClassToClose2 giveInternalResource(){
	return new SomeClassToClose2();
    }
}

class SomeClassToClose2 implements Closeable{
    @Override
    public void close() throws IOException{
	System.out.println("SomeClassToClose2 closes");//called before because close is called in reverse of declaration order
    }
}
