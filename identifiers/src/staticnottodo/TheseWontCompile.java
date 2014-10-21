package staticnottodo;

public static class TheseWontCompile {
   TheseWontCompile(){
   }    
   private void method1(){
        static int whatTheHell = 0;
        NormalInterface normal = new NormalInterface(){};
        static NormalInterface nono = new  NormalInterface(){};
        NormalInterface normal = new NormalInterface(){};
   }    
}

interface NormalInterface{}

