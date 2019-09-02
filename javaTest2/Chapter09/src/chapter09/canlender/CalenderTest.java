package chapter09.canlender;

import java.util.Calendar;

public class CalenderTest {

	public static void main(String[] args) {
		Calendar cal= Calendar.getInstance(); //날짜 구하는 객체
		System.out.println("year"+cal.get(Calendar.YEAR));
		System.out.println("month"+(cal.get(Calendar.MONTH)+1));
		System.out.println("day"+cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("hour"+cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("minute"+cal.get(Calendar.MINUTE));
		System.out.println("second"+cal.get(Calendar.SECOND));
		
	}

}
