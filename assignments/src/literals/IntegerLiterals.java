package literals;
class IntegerLiterals{
    public static void main(String...args){
	int sample1 = 10;
	int sample2 = 1_000_000; //legal
	System.out.println("Integer with under scores:1_000_000=" +sample2);
	int sample3 = 1_0_0_0; //confusing
	System.out.println("Integer with under scores:1_0_0_0=" +sample3);
	int sample4 = 2147483647;
	System.out.println("Integer.toBinaryString(2147483647)=" + Integer.toBinaryString(sample4));
	int sampleBinary1 = 0B100100;
	System.out.println("Binary integer 0B100100=" +sampleBinary1);
	int sampleBinary2 = 0b000101;
	System.out.println("Binary integer 0b000101=" +sampleBinary2);
	int sampleOctal1 = 010;
	System.out.println("Octal integer 010=" +sampleOctal1);
	int sampleOctal2 = 07;
	System.out.println("Octal integer 07=" +sampleOctal2);
	int sampleHex1 = 0xee;
	System.out.println("Hex integer 0xee=" +sampleHex1);
	int sampleHex2 = 0XDeadCafe;
	System.out.println("Hex integer 0XDeadCafe=" +sampleHex2);
	
    }
}
