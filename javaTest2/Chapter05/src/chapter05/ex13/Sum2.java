package chapter05.ex13;

public class Sum2 {

	private int num1;
	private int num2;
	private int sum;
	private double num3;
	private double num4;
	private double sum2;
	
	public Sum2() {
		
		num1=0;
		num2=0;
		sum=0;
		num3=0.0;
		num4=0.0;
		sum2=0.0;
		
	}
	
	public void sum(int num1,int num2) {
		
		sum=num1+num2;
		System.out.println("정수의 합="+sum);
	}
	public void sum(double num3,double num4) {
		
		sum2=num3+num4;
		System.out.println("실수의 합="+sum2);
	}
}
