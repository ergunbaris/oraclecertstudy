package innerclass;

public class OuterClass{
    private int a = 1;
    private class InnerClass{
        private int a = 2;
        
        public void displayInnerA(){
            System.out.println(this.a);
        }
        public void displayOuterA(){
            System.out.println(OuterClass.this.a);
        }
    }
    
    public static void main (String...args){
        OuterClass.InnerClass inner = new OuterClass().new InnerClass();
        inner.displayInnerA();
        inner.displayOuterA();
    }

}
