package privateoverriding;

public class PrivateOverriding{
    public static void main(String...args){
	new SubClass().shout();
    }
}

class SuperClass{
   private final void shout(){System.out.print("yellll");}
}

class SubClass extends SuperClass{
   public final void shout(){System.out.print("what the hell");}
}
