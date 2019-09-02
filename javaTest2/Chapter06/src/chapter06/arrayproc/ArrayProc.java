package chapter06.arrayproc;

import java.util.Scanner;

public class ArrayProc {
	private int[] score;
	private int sum;
	private double average;
	//public static Scanner scan;
	//static {
	//	scan=new Scanner(System.in);			블록초기화
	//}

	public ArrayProc() {
		this(0,0,0.0);
	}
	public ArrayProc(int size, int sum, double average ) {
		this.score=new int[size];
		this.sum=sum;
		this.average=average;
	}
	public void getValues() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("성적을 입력하세요");
		for(int i=0;i<this.score.length;i++)
		{
			score[i]=scan.nextInt();
		}
	}
	public int getSum() {
		for(int i=0;i<this.score.length;i++)
		{
			this.sum=this.sum+score[i];
		}
		return this.sum;
	} 
	public double getAverage() {
		this.average=sum/this.score.length;
		
		return this.average;
	}
}
