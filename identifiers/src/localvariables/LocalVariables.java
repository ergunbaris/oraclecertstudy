package localvariables;


public class LocalVariables{

   static public void main(String...args){
	TestServer server = new TestServer();
	int sample = 9;
	int sample2 = server.testMethod(sample);
	System.out.println("sample:"+sample);
	System.out.println("sample2:"+sample2);
	}
	
}
class TestServer{
   public int testMethod(int param1){
	param1 = 10;
	System.out.println("Param1 in local scope:"+param1);
	return param1;
   }
}
