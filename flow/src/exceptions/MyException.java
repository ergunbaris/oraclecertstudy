package exceptions;
class MyException{
    public static final String PORK = "pork";
    public static void main(String...args){
	try{
	   checkFood("Gnocchi");
	   checkFood(PORK);
	}catch(BadFoodException e){
	}
    }

    private static void checkFood(String food) throws BadFoodException{
	if(food.equalsIgnoreCase("pork")){
	    System.out.println(food + " iyyyk.");
	    throw new BadFoodException();
	}else{
	    System.out.println(food + " is good man! I like it.");
	}
    }
}
