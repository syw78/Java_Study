package chapter05.date;

public class Date {
	private int year;
	private int month;
	private int day;
	
	
	public Date(int year ,int month, int day) {
		
		this.year=year;
		this.month=month;
		this.day=day;
	}
	public void setYear(int year) {
		
		this.year=year;
	}
	public void setMonth(int month) {
		
		this.month=month;
	}
	public void setDay(int day) {
		
		this.day=day;
	}
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDAy() {
		return day;
	}
	public void memberPrint() {
		
		System.out.println(year+"³â "+month+"¿ù "+day+"ÀÏ ");
	}
	
}
