package enuminneroverride;

public enum OverridedEnumExample{
   SMALL("S"),REGULAR("M"),BIG("L"),EXTRABIG("XL"){
	   public String getSize(){
        	return "Uvv" + this.size;
	   }

	};
   
   protected String size;
   private OverridedEnumExample(String size){
	this.size = size;
   }
   public String getSize(){
	return this.size;
   }
   public static void main(String...args){
	for(OverridedEnumExample size:OverridedEnumExample.values()){
	   System.out.println(size.getSize());
	}
   }

}

