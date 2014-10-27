package checkedexceptions;

public class Dog extends Animal{
   public void eat(){}

   public static void main (String...args){
	Animal animal = new Animal();
	Dog dog = new Dog();
	dog.eat();
	animal.eat();//Compiler error
   }
}
