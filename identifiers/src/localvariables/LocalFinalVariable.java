package localvariables;
import java.util.Date;

class LocalFinalVariable{
    public static void main(String...args){
	final Date date;
	date = new Date(); // how come?
	date = new Date(); // not allowed ok great
	final int sampleNo;
	sampleNo=3;
	sampleNo=4; //wasnt this a final primitive?
    }
}
