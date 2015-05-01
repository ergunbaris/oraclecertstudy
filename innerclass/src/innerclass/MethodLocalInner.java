package innerclass;

public class MethodLocalInner{
    public static void main(String...args){
        class MethodLocalSuper{
            int a = 1;
            public void display(){
                System.out.println(a);
            }
        };
        final class MethodLocalSub extends MethodLocalSuper{
            int a = 2;
            public void display(){
                System.out.println(a);
            }            

        };
        MethodLocalSuper method = new MethodLocalSub();
        method.display();
        
        MethodLocalSuper method2 = new MethodLocalSuper();
        method2.display();
    }
}
