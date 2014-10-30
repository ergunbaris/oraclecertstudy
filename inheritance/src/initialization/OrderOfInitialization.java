package initialization;

class OrderOfInitialization{
   public static void main(String [] args){
	new OrderOfInitialization();
   }
   OrderOfInitialization(){
	super();
	System.out.println("after super");
   }
   {
	System.out.println("instance initialazation");
   }
}
