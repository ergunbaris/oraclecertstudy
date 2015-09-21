package subclass;

public class TestAttributesWithSubclass{
    public static void main (String...args){
        Fruit fruit = new Fruit();
        Apple apple = new Apple();
        System.out.println(fruit.juice);
        System.out.println(apple.juice);
    }
}

class Fruit{
    public String juice = "Fruit Juice";
}

class Apple extends Fruit{
    String juice = "Apple Juice";
    // subclasses can have same named attributes
}
