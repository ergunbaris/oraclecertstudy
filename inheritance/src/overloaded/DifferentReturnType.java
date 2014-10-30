package overloaded;
class DifferentReturnType{
    public static void main(String args[]){
		
    }
    
    public long sum(int a, int b){
	return 0L;
    }

    public int sum(int a, int b){// Already defined signature so compiler error
	return 0;
    }
    
}
