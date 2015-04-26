package methods;
import java.util.List;
import java.util.ArrayList;

public class TestPolyMorphicGeneric{
    public static void main(String ... args){
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        touchAnimals(dogs);

        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Crocodile());
        touchAnimals(animals);

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        touchAnimals(cats);

        addCats(cats);
        addCats(animals);
        touchAnimals(animals);
        touchAnimals(cats);
}
    public static void touchAnimals(List<? extends Animal> animals){
        for(Animal animal:animals){
            animal.makeSound();
        }
        System.out.println();
    }
    public static void addCats(List<? super Cat> cats){
        cats.add(new Cat());
        Animal catAsAnimal = new Cat();
        // cats.add(catAsAnimal); This would fail to compile 
        // how come we now animal is a cat?
    }
}

abstract class Animal{
    abstract void makeSound();
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("Houu");
    }
}

class Cat extends Animal{
    void makeSound(){   
        System.out.println("Miaouu");
    }
}

class Crocodile extends Animal{
    void makeSound(){   
        System.out.println("Crouch");
    }
}
