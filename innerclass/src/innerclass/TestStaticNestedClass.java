package innerclass;

class OuterClass{
    public static class StaticNestedClass{    
        public void talk(){
            System.out.println("I am not a Static Inner Class! call me either Static Nested Class or Top-level Nested Class");
        }
    }

}

public class TestStaticNestedClass{
    public static void main(String...args){
        OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
        nested.talk();   
    }

}
