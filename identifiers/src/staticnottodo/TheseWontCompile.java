package staticnottodo;

public static class TheseWontCompile {
   TheseWontCompile(){
   }    
   private void method1(){
        static int whatTheHell = 0; // static modifier in function scope
        NormalInterface normal = new NormalInterface(){};
        static NormalInterface nono = new  NormalInterface(){}; // static modifier in function scope
        NormalInterface normal = new NormalInterface(){};
   }    
}

interface NormalInterface{}

