package dimension;

public class SameDimension{
    public static void main(String...args){
	int [][] twoDimArray = new int [3][];
	int [] oneDimArray = new int[5];
	Integer sample = 7;
	Object sampleObj = sample;
	twoDimArray[0] = (int[])sampleObj; //must fail on run time
	//twoDimArray[0] = sample; //this will fail on compile
	twoDimArray[0] = oneDimArray;
    }
}
