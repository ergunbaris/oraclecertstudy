package constructors;

public class FinalVariableFailsToInit{
   public static void main(String [] args){
	new Fish("white").eat();
   }
}

class Animal{
    public Animal(){
	System.out.println("Animal instincts created");
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
	this();
	this.color = color;
	System.out.println("A color" + color  +" Fish borns");
    }
    public void eat(){	
	System.out.println("Fish eats");
    }
}
