package initialization;
class StaticInitializationError{
   static int [] x = {1,2,3,4};
   static {System.out.println(x[4]);}
   public static void main(String...args){
   }
}
