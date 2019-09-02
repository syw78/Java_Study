package chapter06.arrayproc2;

import java.util.Arrays;

public class ArrayProc {
	private int [] score;
	private int sum;
	private double average;
	private int max;
	private int min;
	
	public ArrayProc(int size) {
		
		this.score=new int[size];
		this.sum=0;
		this.average=0.0;
		this.max=0;
		this.min=0;
	}
	public void getValues() {
		
		for(int i=0;i<score.length;i++)
		{
			score[i]=(int)(Math.random()*(100-1+1)+1);
			System.out.print(score[i]+" ");
		}
	}
	public int getSum() {
		
		for(int i=0;i<score.length;i++)
		{
			this.sum=sum+score[i];
		}
		return this.sum;
	}
	public double getAverage() {
		
		this.average=this.sum/score.length;
		
		return this.average;
	}
	public void printArray() {
		for(int i=0;i<score.length;i++)
		{
			System.out.println(score[i]);
		}
	}
	public int getMax() {
		this.max=score[0];
		for(int i=0;i<score.length;i++)
		{
			if(this.max<score[i])
			{
				this.max=score[i];
			}
		}
				return this.max;
	}
	public int getMin() {
		this.min=score[0];
		for(int i=0;i<score.length;i++)
		{
			if(this.min>score[i])
			{
				this.min=score[i];
			}
		}
				return this.min;
	}
	@Override
	public String toString() {
		return "ArrayProc [score=" + Arrays.toString(score) + ", sum=" + sum + ", average=" + average + ", max=" + max
				+ ", min=" + min + "]";
	}
	
}
