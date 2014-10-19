package interfacevariables;

interface VariablesArePublicStatic{
    public static final int A_CONSTANT= 0;
}

interface VariablesImplicit{
    int A_CONSTANT= 0;
    static int A_CONSTANT_2=1;
    final int A_CONSTANT_3=2;
    static final int A_CONSTANT_4=3;
}

interface VariablesWontCompile{
    private static final int A_CONSTANT= 0;
}

interface VariablesWontCompile2{
    protected int A_CONSTANT= 0;
}
