package formatter;

public class FormatTest{
    public static void main(String...args){
	System.out.format(">%2$0(7d< + >%1$+-9.2f< \n",-500.235F,100);
	System.out.printf(">%(-9.4f< \n",-1.23456F);
    }
}
