package objects;
class NullReferenceTest{
    public static void main(String...args){
	// Run with enabled assertions
	NullReferenceTest firstRef = null;
	NullReferenceTest secondRef = firstRef;
	NullReferenceTest thirdRef = null;
	Object fourthRef = null;
	assert firstRef == secondRef;
	assert firstRef == thirdRef;
	assert fourthRef == firstRef;
	System.out.println("This is firstRef:" + firstRef + " and secondRef:" +secondRef);
    }
}
