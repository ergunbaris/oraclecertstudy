package loops;

public class VariousForLoops{
    public static void main(String...args){
	for(;;){
	    System.out.println("for(;;)");
	    break;
	}

	for(int x=0;;){
	    System.out.println("for(int x=0;;)");
	    break;
	}
	int y=2;
	for(;y<3;){
	    System.out.println("for(;y<3;)");
	    y++;
	}

	for(;;y++){
	    System.out.println("for(;;y++)");
	    if(y==5){		
		break;
	    }
	}
    }
}
