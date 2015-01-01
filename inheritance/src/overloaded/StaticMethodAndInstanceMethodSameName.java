package overloaded; 

class StaticMethodAndInstanceMethodSameName{
    private static void m1(){}
    private void m1(){} // already defined name not a legal overloading
    // how does the JVM decide which method to use if an instance calls instance.m1();
    // it can mean the static or the instance method same time !!!
    private int m2(){return 0;}
    private Number m3(){return new Integer(2);}
    private Integer m3(){return 1;} // already defined name not a legal overloading practice
    // how does the JVM decide which method to use if same signature for different return types?
    private double m2(int i){return 0.0;}
}
