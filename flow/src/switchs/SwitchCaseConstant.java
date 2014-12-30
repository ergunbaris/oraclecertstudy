package switchs;
class SwitchCaseConstant{
    final static int c;
    public static void main(String...args){
	final int a = 1;
	final int b;
	b=2; // what do you expect local variables are not initialized when declared
	b=3;
	int x = 0;
	switch(x){
	   case a:
	   break;
	   case a: // also not legal
	   case b: //compiler error
	   break;
	   default:
	   break;

	}
	String y = "sample";
	final String d = "soso";
	final String e;
	e = "did";
	e = "was";	
	switch(y){
	    case d:
	    break;
	    case e:
	    break;
	}
    }
}
