package formatter;

public class FormatTestWithBoolean{
    public static void main(String...args){
        System.out.printf("%b\n",false);
        System.out.printf("%b\n",Boolean.FALSE); // any thing different than false will return true
        System.out.printf("%b\n",true);
        System.out.printf("%b\n",1);
        System.out.printf("%b\n",'d');
    }
}
