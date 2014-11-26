package precedence;
class CompoundAssignments{
    public static void main(String...args){
	int y = 6;
	y *= 5+2;
	System.out.println(y);	
	System.out.println("y*=5+2 is evaluated as y = y*(5+2)");
    }
}
