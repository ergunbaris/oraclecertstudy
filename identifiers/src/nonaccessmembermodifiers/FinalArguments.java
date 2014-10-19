package helloworldmain;

public class FinalArguments {

    public static void main(String[] args) {
	System.out.println("Final Arguments");
    }
    public String getRecord(int fileNumber, final int recNumber){
	fileNumber = 1;
	recNumber = 6; //Wont compile
	return Integer.toString(fileNumber);
    }
    
}

