package innerclass;

public class OuterClassInheritance{
    private int a = 1;
    private abstract class InnerSuperClass{
        private int a = 2;
        
        public void displayInnerA(){
            System.out.println(this.a);
        }
        public void displayOuterA(){
            System.out.println(OuterClassInheritance.this.a);
        }
    }
    private class InnerSubClass extends InnerSuperClass{
        private int a = 3;
        
        public void displayInnerA(){
            System.out.println(this.a);
        }
        public void displayOuterA(){
            System.out.println(OuterClassInheritance.this.a);
        }
    }
    
    
    public static void main (String...args){
        OuterClassInheritance.InnerSuperClass inner = new OuterClassInheritance().new InnerSubClass();
        inner.displayInnerA();
        inner.displayOuterA();
    }

}
