import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;



public class Driver {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		long milli = date.getTime();
		
		CurrentTime ct = new CurrentTime(milli);
		System.out.println(ct);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Calendar calender = new GregorianCalendar();
		System.out.println(dateFormat.format(calender.getTime()));
		
		Calendar wayBack = new GregorianCalendar(1960, 0, 10, 2,11);
		System.out.println(dateFormat.format(wayBack.getTime()));
	}

}
