package interfacevariables;

public abstract interface MethodsArePublicAbstract{
    native int f();
    public double x();
} 

abstract interface MethodsArePublicAbstract2{
    strictfp abstract float y();
} 

abstract interface MethodsArePublicAbstract3{
    public final boolean fx();
} 
