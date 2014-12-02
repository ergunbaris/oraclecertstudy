package dimension;

public class SameDimension{
    public static void main(){
	int [][] twoDimArray = new int [3][];
	int [] oneDimArray = new int[5];
	int sample = 7;
	twoDimArray[0] = sample; //must fail
	twoDimArray[0] = oneDimArray;
    }
}
