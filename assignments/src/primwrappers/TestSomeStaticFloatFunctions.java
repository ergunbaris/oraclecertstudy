package primwrappers;

public class TestSomeStaticFloatFunctions{
    public static void main(String ... args){
        float a = 7.4F;
        int b = Float.floatToIntBits(a);
        float c = Float.intBitsToFloat(b);
        System.out.printf("%f,%d,%f\n",a,b,c);
    }
}
