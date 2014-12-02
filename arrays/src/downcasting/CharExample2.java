package downcasting;
class CharExample2{
   public static void main(String [] args){
	char [] sample = {0x4e, '\u004e', 70000}; //over the char limit
	for(char found:sample){
	   System.out.print(found + ",");
	}
   }
}
