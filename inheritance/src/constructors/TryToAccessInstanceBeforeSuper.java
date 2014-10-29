package constructors;

public class TryToAccessInstanceBeforeSuper{
   public static void main(String [] args){
	new Fish("white").eat();
   }
}

class Animal{
    public Animal(){
	System.out.println("Animal instincts created");
    }
    public Animal(String color){
	System.out.println("Animal "+color +" instincts created");
    }
    protected void eat(){

    }
}

class Fish extends Animal{
    private final String color;
    Fish(){
	this.color = "blue";
	System.out.println("A " + color  +" Fish borns");
    }
    Fish(String color){
	super(this.color);
	this.color = color;
	System.out.println("A " + color  +" Fish borns");
    }
    public void eat(){	
	System.out.println("Fish eats");
    }
}
