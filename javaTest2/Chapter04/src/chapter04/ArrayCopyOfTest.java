package chapter04;

public class ArrayCopyOfTest {

	public static void main(String[] args) {
		//1.정수형 객체배열을 만든다.
		
		int [] num1=new int[] {1,2,3,4,5};
		for(int value:num1) {
			System.out.print(value+" ");
		}
		int[] num2 = arraysCopyOf(num1);
		System.out.println();
		for(int value:num2) {
			System.out.print(value+" ");
		}
	}
	
	public static int [] arraysCopyOf(int[] num1) {
		int[] num2=new int[num1.length];
		for(int i=0;i<num1.length;i++) {
			num2[i]=num1[i];
		}
		
		return num2;
	}

}
