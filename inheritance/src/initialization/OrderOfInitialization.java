package initialization;

class OrderOfInitialization extends SomeClass{
   private int ber;
   public static void main(String [] args){
	new OrderOfInitialization();
   }
   OrderOfInitialization(){
	super();
	System.out.println("sub constructor");
   }
   {
	ber = 6;
	System.out.println("sub initialazation");
   }
}

class SomeClass{
   public SomeClass(){
	System.out.println("super constructor");
   }
   {
	System.out.println("super initialazation");
   }
}
