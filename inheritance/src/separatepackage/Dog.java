package separatepackage;

import packagewise.Animal;

public class Dog extends Animal{
   public void eat(){// default accessor on separate package!!!
	System.out.println("dog eats");
   }
   
}
