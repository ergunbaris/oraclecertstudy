package precedence;

class ScopeTest{
   static int x = 5;
   public static void main(String...args){
	int x = (x=3) *4;// yes you can assign variable and continue like this 
	System.out.println(x);
   }
}
