package chapter03;

import java.time.LocalDateTime;
import java.time.Month;

public class TimerTest {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		int year = localDateTime.getYear();
		Month month = localDateTime.getMonth();
		int day = localDateTime.getDayOfMonth();
		int hour = localDateTime.getHour();
		int minute = localDateTime.getMinute();
		int second = localDateTime.getSecond();
	}
}
