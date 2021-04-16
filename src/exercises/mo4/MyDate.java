package exercises.mo4;

import java.util.GregorianCalendar;

public class MyDate {
	public final String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	private static int day = 1;
	private static int month = 0;
	private static int year = 1970;
	private static long elapsedTime = 0;
	
	public MyDate(long timeElapsed) {
		if (timeElapsed > 0) {
			elapsedTime = timeElapsed;
			setDate();
		}
	}

	public int getDay() {
		return day;
	}
	
	public String getMonth() {
		return months[month];
	}
	
	public int getYear() {
		return year;
	}
	
	public static void setDate() {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(elapsedTime);
		day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
		month = calendar.get(GregorianCalendar.MONTH);
		year = calendar.get(GregorianCalendar.YEAR);
	}
}
