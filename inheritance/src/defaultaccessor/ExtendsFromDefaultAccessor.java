package defaultaccessor;

public class ExtendsFromDefaultAccessor extends SuperClass{
   String aMember = "f";
   public static void main(String...args){
	SuperClass shouter = new ExtendsFromDefaultAccessor();
	shouter.shout();
	System.out.println(shouter.aMember);
	System.out.println(new ExtendsFromDefaultAccessor().aMember);
   }
   @Override
   void shout(){
	System.out.println("iiii");
	System.out.println(this.aMember);
	System.out.println(super.aMember);
	
   }
}

class SuperClass{
    String aMember = "fz";

    void shout(){
	System.out.println("Booooo");
    }
}
