package asserts;

public class TestAssert{
    // Ofcourse run with -ea
    public static void main (String [] args){
	//testReallySimpleAssert();
	testSimpleAssert();
    }
    private static void testReallySimpleAssert(){
	assert (0>1);
    }
    private static void testSimpleAssert(){
	assert (0>1):"how can 0 > 1 ?";
    }
}
