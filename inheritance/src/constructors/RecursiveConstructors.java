package constructors;
public class RecursiveConstructors{

}

class SomeClass{
   public SomeClass(){
	this("what the");
   }
   SomeClass(String s){
	this();
	System.out.println(s);	
   }
}
