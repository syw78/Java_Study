package chapter06.ex28;

import java.util.Scanner;

public class Average {

	private int num1;
	private int num2;
	private int num3;
	private double average;
	
	public Average() {
		
		num1=0;
		num2=0;
		average=0.0;
		num3=0;
	}
	
	public void getAverage(int a , int b) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���");
		this.num1=scan.nextInt();
		System.out.print("������ �Է��ϼ���");
		this.num2=scan.nextInt();
		
		this.average=(this.num1+this.num2)/2;
		System.out.println("2�������� ���="+average);
	}
	public void getAverage(int a , int b, int c) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���");
		this.num1=scan.nextInt();
		System.out.print("������ �Է��ϼ���");
		this.num2=scan.nextInt();
		System.out.print("������ �Է��ϼ���");
		this.num3=scan.nextInt();
		
		this.average=(this.num1+this.num2+this.num3)/3;
		System.out.println("3�������� ���="+average);
	}
	
}
