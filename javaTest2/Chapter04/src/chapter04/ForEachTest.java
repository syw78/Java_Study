package chapter04;

public class ForEachTest {

	public static void main(String[] args) {
		//1.정수형 배열 객체를 3개선언한다.
		//int [] numbers = new int[] {10,20,30};
		ForEach forEach= new ForEach();
		//2.배열객체를 일반포문을 활용하여 출력한다.
		forEach.generalFor();
		
		
		//3.향상된 포문을 활용한다.
		System.out.println("");
		
		forEach.improveFor();
	}
}
