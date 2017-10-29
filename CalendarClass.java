/*
* Victor Bieniek
* 9/29/17
*
*/

import java.util.GregorianCalendar;

public class CalendarClass
{
	public static void main(String[] args)
	{
		GregorianCalendar cal = new GregorianCalendar();

		System.out.printf("\nCurrent year: %s\n", cal.get(GregorianCalendar.YEAR));
		System.out.printf("Current month: %s\n", cal.get(GregorianCalendar.MONTH));
		System.out.printf("Current day: %s\n", cal.get(GregorianCalendar.DAY_OF_MONTH));

		cal.setTimeInMillis(1234567898765L);
		System.out.printf("\n\nModified year: %s\n", cal.get(GregorianCalendar.YEAR));
		System.out.printf("Modified month: %s\n", cal.get(GregorianCalendar.MONTH));
		System.out.printf("Modified day: %s\n\n", cal.get(GregorianCalendar.DAY_OF_MONTH));
	}
}