package constructors;

public class AccessThisBeforeConstructorCompletes{
   public static void main(String...args){
	Square square = new Square(4);
	square.displayAbout();
	System.out.println(square);
   }
}

class Square extends Shape{
   private int xLength;

   Square(int sideLength){
	xLength = sideLength;
   }
   private String aboutShape = this.toString();// This means calling 
   // the method with unitialized values. Because constructor not finsihed yet

   private int area = this.calculateArea();
   public int calculateArea(){
	return xLength^2;
   }

   @Override
   public String toString(){
	return "Square sideLength=" + xLength + " area=" + area;
   }

   public void displayAbout(){
	System.out.println(aboutShape);
   }
}

class Shape{
   public int calculateArea(){
        return 0;
   }

   @Override
   public String toString(){
	return "Shape sideLength=" + 0;
   }
}
