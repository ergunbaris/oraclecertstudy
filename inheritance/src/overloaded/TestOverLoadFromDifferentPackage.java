package overloaded;
import separatepackage.*;

public class TestOverLoadFromDifferentPackage extends TestOverloadClass{
    int testMethod(int something){ // This is not override it is overload 
        return 1;
    }
}

