package hackerrank.hackerrank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//Java Date and Time
public class JavaDateandTime {
	public static void main(String[] args) throws ParseException{
		Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
	}
    public static String getDay(String day, String month, String year) {
        /*
        * Write your code here.
        */
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyyyy");
		Date date = null;
		try {
			date = formatter.parse(month+day+year);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Calendar cal = Calendar.getInstance() ;
		cal.setTime(date);
		String result="";
		switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			result = "SUNDAY";
			break;
		case 2:
			result = "MONDAY";
			break;
		case 3:
			result = "TUESDAY";
			break;
		case 4:
			result = "WEDNESDAY";
			break;
		case 5:
			result = "THURSDAY";
			break;
		case 6:
			result = "FRIDAY";
			break;
		case 7:
			result = "SATURDAY";
			break;
		default:
			break;
		}
		return result;
    }
}
