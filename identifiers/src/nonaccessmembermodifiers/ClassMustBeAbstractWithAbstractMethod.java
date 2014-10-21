package nonaccessmembermodifiers;

abstract class ClassMustBeAbstractWithAbstractMethod{
   abstract void showSample(); // This will compile
}

class ClassMustBeAbstractWithAbstractMethod2{
   abstract void showSample(); // This wont compile
}

abstract class ClassMustBeAbstractWithAbstractMethod3{
   void showSample(){} // This will compile abstratc class no need to have abstract method
}
