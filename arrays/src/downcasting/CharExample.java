package downcasting;
class CharExample{
   public static void main(String [] args){
	char [] sample = {0x4e, '\u004e', 78};
	for(char found:sample){
	   System.out.print(found + ",");
	}
   }
}
