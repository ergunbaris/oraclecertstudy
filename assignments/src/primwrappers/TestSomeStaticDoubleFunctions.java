package primwrappers;

public class TestSomeStaticDoubleFunctions{
    public static void main(String ... args){
        double a = 7.4;
        long b = Double.doubleToLongBits(a);
        double c = Double.longBitsToDouble(b);
        System.out.printf("%f,%d,%f\n",a,b,c);
    }
}
