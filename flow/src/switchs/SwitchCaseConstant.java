package switchs;
class SwitchCaseConstant{
    final static int c = 3;
    public static void main(String...args){
	final int a = 1;
	final int b;
	b=2; // what do you expect local variables are not initialized when declared
	int x = 0;
	switch(x){
	   case a:
	   break;
	   case a: // also not legal
	   case b: // compiler error only initialized when declared constants accepted.
	   break;
	   case c:
	   break;
	   default:
	   break;

	}
	String y = "sample";
	final String d = "soso";
	final String e;
	e = "did";
	switch(y){
	    case d:
	    break;
	    //case e:
	    //break;
	}
    }
}
