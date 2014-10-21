package paramname;

public class LocalVarNameParamName {
    int size = 27;

    public static void main(String[] args) {
	System.out.println("Hello Template");
	LocalVarNameParamName test = new LocalVarNameParamName();
	test.setSize(26);
	System.out.println(test.size);
    }

    public void setSize(int size){
	size = size;
    }
    
}

