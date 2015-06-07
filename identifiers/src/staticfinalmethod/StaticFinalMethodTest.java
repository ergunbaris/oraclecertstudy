package staticfinalmethod;
public class StaticFinalMethodTest{

}

class A {
    static final void print(){}; // cannot override this even it is static
}

class B extends A {
    static void print(){};
}
