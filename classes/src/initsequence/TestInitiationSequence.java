package initsequence;

public class TestInitiationSequence{
    public static void main(String...args){
        Horse p = new Horse();
    }
}

class Animal{
    static{
        System.out.println("1");
    }
    {   
        System.out.println("3");
    }
    Animal(){
        System.out.println("5");
    }
    {   
        System.out.println("4");
    }
    
}

class Horse extends Animal{
    static{
        System.out.println("2");
    }
    {   
        System.out.println("6");
    }
    Horse(){
        System.out.println("7");        
    }
}
