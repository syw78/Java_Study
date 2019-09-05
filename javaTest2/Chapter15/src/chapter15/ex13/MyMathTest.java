package chapter15.ex13;

public class MyMathTest {

	public static void main(String[] args) {
		
		Integer[] t = { 10,20,30,40,50};
		double average = MyMath.<Integer>getAverage(t);
		System.out.println(average);
		
		
		Double[] t2 = { 10.0,20.0,30.0,40.0,50.0};
		double average2 = MyMath.<Double>getAverage(t2);
		System.out.println(average2);
	}

}
