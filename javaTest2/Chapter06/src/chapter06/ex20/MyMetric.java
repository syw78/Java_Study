package chapter06.ex20;

public class MyMetric {
	private static double kilo;
	private static double mile;
	
	public MyMetric() {
		
		this(0.0,0.0);
		
	}
	public MyMetric(double k, double m) {
		
		kilo=k;
		mile=m;
	}
	
	static double kiloToMile() {
		return kilo*0.625;
	}
	static double mileTokilo() {
		return mile*1.609;
	}
	

}
