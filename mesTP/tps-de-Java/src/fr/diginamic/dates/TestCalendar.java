package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	public static void main(String[] args) {

		
		
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 5, 19, 23, 59, 30);
		Date date1 = cal.getTime();
		System.out.println(date1);
		
		
		Calendar cal1 = Calendar.getInstance();
		cal1.set(Calendar.YEAR, 2002);
		cal1.set(Calendar.MONTH, 8);
		cal1.set(Calendar.DAY_OF_MONTH, 19);
		//cal1.set(Calendar.HOUR_OF_DAY, 0);
		//cal1.set(Calendar.MINUTE, 0);
		//cal1.set(Calendar.SECOND, 0);
		Date date = cal1.getTime();
		System.out.println(date);
		
		SimpleDateFormat formatReverse = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String dateReverse = formatReverse.format(date);	
		System.out.println(dateReverse);
		
		Calendar date2 = Calendar.getInstance();
		
		
		//SimpleDateFormat = formateurFR =
	}

}
