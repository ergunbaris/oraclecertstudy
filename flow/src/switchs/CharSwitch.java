package switchs; 
class CharSwitch{
    public static void main(String...args){
	char a = '\u0061';
	System.out.println(a);
	switch(a){
	   case 97:
		System.out.println(a);
	   break;
	   //case 70000: // should fail implicit cast
	   case 'b':
		System.out.println("b");
	   break;
		
	}
	
    }
}
