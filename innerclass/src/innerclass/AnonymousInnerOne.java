package innerclass;

class Popcorn{
    public void pop(){
        System.out.println("popcorn");
    }
}
interface Poppable{
    public void pops();
}
public class AnonymousInnerOne{
    Popcorn popcorn = new Popcorn() {
        public void what(){
            System.out.println("what the!!");
        }
        public void pop(){
            System.out.println("anon popcorn");
        }
        
    };

    Poppable poppable = new Poppable (){
        public void pops(){
            System.out.println("PoooooP");
        }
    };
    
    public static void main (String...args){
        new AnonymousInnerOne().popcorn.pop();
        new AnonymousInnerOne().poppable.pops();
        //new AnonymousInnerOne().popcorn.what(); // compilation fails 
        // because Anonymous Inner Class Popcorn implementation is just
        // like a new SubClass implementation but the class member reference
        // popcorn type is the actual Popcorn class.
    }
}
