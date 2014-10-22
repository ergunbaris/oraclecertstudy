package enummodifiers;

public class InSideClass{
   static{
        System.out.println(new InSideClass().anotherEnum.LEGAL);
	for(InSideClassEnum insider:InSideClassEnum.values()){		
	    System.out.println(insider);
	    System.out.println(insider.getOrder());
	    System.out.println(insider.getOrder2());
	}
   }	
   private static enum InSideClassEnum{
	LEGAL(3){
	   int getOrder(){
		return order;
	   }
	}, ILLEGAL(2){
           int getOrder(){
                return order+3;
           }
        }; 
	protected int order;
	InSideClassEnum(int order){
	   this.order = order;
	}
	abstract int getOrder();
	final int getOrder2(){
	   return order+1;
	}
   };
   static OutSideClassEnum anEnum;
   OutSideClassEnum anotherEnum;
   public static void main(String args[]){
	System.out.println(anEnum.LEGAL);
	System.out.println(new InSideClass().anotherEnum.LEGAL);
	for(InSideClassEnum insider:InSideClassEnum.values()){
	    System.out.println(insider);
	    System.out.println(insider.getOrder());
	    System.out.println(insider.getOrder2());
	}
   }
}

enum OutSideClassEnum{LEGAL}
