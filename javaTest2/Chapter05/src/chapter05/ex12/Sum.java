package chapter05.ex12;

public class Sum {

	private int num1;
	private int num2;
	private int num3;
	private int sum;
	
	public Sum() {
		num1=0;
		num2=0;
		num3=0;
		sum=0;
	}
	public int sum(int num1,int num2) {
		
		this.sum=num1+num2;
		return sum;
	}
	public int sum(int num1,int num2,int num3) {
		
		this.sum=num1+num2+num3;
		return sum;
	}
}
