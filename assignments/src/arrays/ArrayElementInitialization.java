package  arrays;
class ArrayElementInitialization{
    private static double [] staticArray = new double[4];
    int [] instanceArray = new int[5];
    public static void main(String...args){
	for(int found:(new ArrayElementInitialization()).instanceArray){
	   System.out.println("int array");
	   System.out.println(found);
	}
	for(double found: staticArray ){	   
	   System.out.println("double array");
	   System.out.println(found);
	}
	for(float found:(new ArrayElementInitialization()).getFloatArray()){
	   System.out.println("float array");
	   System.out.println(found);
	}
    }
    
    public float[] getFloatArray(){
	return new float[5];	
    }
}
