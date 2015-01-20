package calendar;

import java.util.Locale;
import java.util.Date;
import java.text.DateFormat;

public class TestCalendarWithLocale{
    public static void main (String...args){
	Locale locTr = new Locale("tr","TR");
	Locale locPt = new Locale("pt","PT");
	Locale locBr = new Locale("pt","BR");

	DateFormat dfTr = DateFormat.getDateInstance(DateFormat.FULL,locTr);
	System.out.println(locTr.getDisplayCountry() + dfTr.format(new Date()));
	DateFormat dfBr = DateFormat.getDateInstance(DateFormat.FULL,locBr);
	System.out.println(locBr.getDisplayCountry() + dfBr.format(new Date()));
	DateFormat dfPt = DateFormat.getDateInstance(DateFormat.FULL,locPt);
	System.out.println(locPt.getDisplayCountry() + dfPt.format(new Date()));
    }
}
