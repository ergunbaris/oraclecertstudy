package constructors; 
public class ConstructorInitSequence{
    public static void main(String args[]){
	new Sub();
	new Sub();
    }
}

class Sub extends Super {
   static{System.out.println("Sub static init 1");}
   {System.out.println("Sub init 1");}
   public Sub(){
	System.out.println("constructor Sub");
   }
   {System.out.println("Sub init 2");}
   static{System.out.println("Sub static init 2");}
}

class Super{
   {System.out.println("Super init 1");}
   static{System.out.println("Super static init 1");}
   public Super(){
	System.out.println("constructor Super");
   }
   static{System.out.println("Super static init 2");}
   {System.out.println("Super init 2");}

}
