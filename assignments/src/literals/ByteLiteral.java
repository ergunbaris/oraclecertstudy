package literals;
class ByteLiteral{
    public static void main(String [] args){	
	byte sample = (byte)0B11111111;
	byte sample2 = (byte)0B10000000;
	byte sample3 = (byte)0B10000011;
	byte sample4 = 0B01111111; //implicit
	System.out.println("must be -1: " + sample);
	System.out.println("must be -128: " + sample2);
	System.out.println("must be -125: " + sample3);
	System.out.println("must be 127: " + sample4);	
    }
}
