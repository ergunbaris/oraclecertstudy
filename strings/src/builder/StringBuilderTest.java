package builder;

public class StringBuilderTest{
    public static void main(String...args){
	// run with assertions enabled
	StringBuilder builder = new StringBuilder("Very long string");
	builder.setLength(4);
	assert builder.toString().equals("Very");
	builder.setLength(8);
	assert builder.toString().equals("Very\u0000\u0000\u0000\u0000");
	builder.ensureCapacity(5);
	System.out.println(builder.toString());
    }
}
