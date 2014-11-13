package objects;
class NullReferenceTest{
    public static void main(String...args){
	NullReferenceTest firstRef = null;
	NullReferenceTest secondRef = firstRef;
	NullReferenceTest thirdRef = null;
	assert firstRef == secondRef;
	assert firstRef == thirdRef;
	System.out.println("This is firstRef:" + firstRef + " and secondRef:" +secondRef);
    }
}
