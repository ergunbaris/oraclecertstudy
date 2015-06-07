package innerclass;
public class ShadowedMethod{
    public static final void main (String...args){
        A a = new A();
        A.B b = a.new B();
    
    }

}

class A {
    private int a = 1;
    void m1(int i){
        System.out.println(i);
    }
    class B{
        void m1(){
            m1(a);
            // SHADOWING IS BASED ON NAME RATHER THAN SIGNATURE
            // A.this.m1(a);
        }
    }    

}
