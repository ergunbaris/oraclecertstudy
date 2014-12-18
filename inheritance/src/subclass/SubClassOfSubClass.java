package subclass;

import subclass1.SubClass1;

public class SubClassOfSubClass extends SubClass1{
    public static void main (String ... args){
	SubClassOfSubClass sub = new SubClassOfSubClass();
	System.out.println();
	System.out.println(sub.getNumb());
    }
    public int getNumb(){return this.numb;};
}
