package serialization;
import java.io.*;

public class TestSerialization{
    public static void main(String ... args){
        Collar collar = new Collar(5);
        Dog dog = new Dog(collar,3);
        try(FileOutputStream fs = new FileOutputStream("dog.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fs)){
            oos.writeObject(dog);
        }catch(FileNotFoundException e){
            // checked excep of writeObject method
        }catch(IOException e){            
            // checked excep of writeObject method
        }catch(Exception e){
        }
        try(FileInputStream fis = new FileInputStream("dog.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);){
            Dog serDog = (Dog) ois.readObject();
            System.out.println(dog);        
        }catch(FileNotFoundException e){
            // checked excep of writeObject method
        }catch(IOException e){            
            // checked excep of writeObject method
        }catch(Exception e){
        }
    }
}

class Dog implements Serializable{
    private final Collar collar;
    private int age;
    public Dog(Collar collar, int age){
        this.collar = collar;
        this.age = age;
    }
    public Collar getCollar(){return collar;}
    @Override
    public String toString(){
        return String.format("Dog is age:%d with collar:%s", age, collar);
    }
}

class Collar implements Serializable{
    private final int size;
    Collar(int size){
        this.size = size;
    }
    public int getSize(){return size;}
    public String toString(){
        return String.format("Collar is with size:%d", size);
    }
}
