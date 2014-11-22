package interning;
class StringInternTest{
    public static void main(String...args){
        String sample1 = "String1";
        String sample2 = "String2";
	String sample3 = "String" + 1;
        String [] sampleArray = new String[2];
        for(int index=1;index<3;index++){
            sampleArray[index-1] = "String" + index;
        }
        String [] sampleArray2 = new String[2];
        for(int index=1;index<3;index++){
            sampleArray2[index-1] = "String" + index;
        }
        for(int index=0;index<2;index++){	
            System.out.println(sampleArray[index]==sampleArray2[index]);
        }
	
        System.out.println(sample3==sample1);
        System.out.println(sampleArray[0]==sample1);
        System.out.println(sampleArray[1]==sample2);
    }
}

