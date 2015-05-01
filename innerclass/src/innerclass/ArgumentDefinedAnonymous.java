package innerclass;

public class ArgumentDefinedAnonymous{
    public static void main(String...args){
        Reader reader = new Reader();
        reader.reads(new Readable(){
                public String displayPage(){
                    return "remember the shit";   
                }
            });
        reader.speaks();
    }    
}

interface Readable{
    String displayPage();
}

class Reader{
    String readersBlurryMind;    
    void reads(Readable r){
        readersBlurryMind = r.displayPage();        
    }
    void speaks(){
        System.out.println(readersBlurryMind);
    }
}
