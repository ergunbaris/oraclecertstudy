package interfacevariables;

public abstract interface MethodsWontCompile{
    native int f();
    public double x();
} 

abstract interface MethodsArePublicAbstract2{
    strictfp abstract float y();
} 

abstract interface MethodsArePublicAbstract3{
    public final boolean fx();
} 
