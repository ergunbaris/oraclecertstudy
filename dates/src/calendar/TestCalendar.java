package calendar;

import java.util.*;

public class TestCalendar{
    public static void main(String...args){
	Date d1 = new Date(1_000_000_000L);
	Calendar c = Calendar.getInstance();
	c.setTime(d1);	
	System.out.println("date:" + c.getTime());
	if(Calendar.SUNDAY == c.getFirstDayOfWeek()){
	    System.out.println("Sunday is First day of week:");
	}
	System.out.println("trillionth miliday of week:" + c.get(Calendar.DAY_OF_WEEK));
	c.add(Calendar.MONTH,1);				
	System.out.println("new date" + c.getTime());
    }
}
