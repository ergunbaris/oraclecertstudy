package precedence;

class ScopeTest{
   public static void main(String...args){
        int x = 5;
	x += (x=3) *4;// yes you can assign variable and continue like this 
	System.out.println(x);
   }
}
