package interfaces;

class ImplementSameSignaturedInterfaces{
    public static void main(String...args){
	new SomeClass().m1();
    }
}

class SomeClass implements SomeInterface1, SomeInterface2{
   public void m1(){System.out.println(SomeInterface1.VALUE);}
   // public void m1(){System.out.println(VALUE);} cant because VALUE is ambigous
}

interface SomeInterface1{
   int VALUE = 2;
   void m1();
}
interface SomeInterface2{
   int VALUE = 3;
   void m1();
}
