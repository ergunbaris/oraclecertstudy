package objects;
class TwoDifferentObjectReferencesPointingSameObject{
    public static void main(String...args){
	Sample s1 = new Sample();
	s1.sample = 2;
	Sample s2 = s1;
	System.out.println(s1);
	System.out.println(s2);
	
    }
}

class Sample{
    int sample = 1;
}
