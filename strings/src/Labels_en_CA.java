import java.util.ListResourceBundle;

public class Labels_en_CA extends ListResourceBundle{
    protected Object [][] getContents(){
	return new Object[][]{{"hello", new HelloString("Hello Weird World")}};
    }
}

class HelloString{
    private final String helloString;
    HelloString(String helloStr){
	helloString = helloStr;	
    }
    @Override
    public String toString(){
	return helloString;
    }
}
