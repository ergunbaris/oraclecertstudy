package constructors;

public class IllegalConstructorCall{
   public static void main(String [] args){
   }
}

class Animal{
    public Animal(){
	System.out.println("Animal instincts created");
    }
    protected void eat(){
	Animal();
    }
}
