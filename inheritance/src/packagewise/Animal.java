package packagewise;

import separatepackage.Dog;

public abstract class Animal{
   abstract void eat();
   
   static public void main(String args[]){
	//Test Animal;
	Animal animal = new Cat();
	Animal animal2 = new Dog(); //This shoudlnt compile
	animal.eat();
	animal2.eat();
   }
}
