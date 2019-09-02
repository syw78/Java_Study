package chapter05.ex14;

public class Date {
	
	private int year;
	private int month;
	private int day;
	
	public Date() {
		year=0;
		month=0;
		day=0;
	}
	public Date(int year ,int month,int day) {
		this.year=year;
		this.month=month;
		this.day=day;
	}
	public void print1() {
		
		System.out.println(year+"."+month+"."+day);
	}
	public void print2() {
		
			switch(month) {
			case 1:
				System.out.println("January "+day+" "+year); break;
			case 2:
				System.out.println("February "+day+" "+year); break;
			case 3:
				System.out.println("March "+day+" "+year); break;
			case 4:
				System.out.println("April "+day+" "+year); break;
			case 5:
				System.out.println("May "+day+" "+year); break;
			case 6:
				System.out.println("June "+day+" "+year); break;
			case 7:
				System.out.println("July "+day+" "+year); break;
			case 8:
				System.out.println("August "+day+" "+year); break;
			case 9:
				System.out.println("September "+day+" "+year); break;
			case 10:
				System.out.println("October "+day+" "+year); break;
			case 11:
				System.out.println("november "+day+" "+year); break;
			case 12:
				System.out.println("December "+day+" "+year); break;	
			}
		}	
	}
	
	

