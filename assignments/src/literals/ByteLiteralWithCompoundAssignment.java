package literals;
class ByteLiteralWithCompoundAssignment{
    public static void main(String [] args){
	byte sample = 3;
	sample += 7; //will compile
	sample = (byte)(sample +7); // needs explicit cast
	sample += 400; // off the limits?
	System.out.println(sample);
    }
}
