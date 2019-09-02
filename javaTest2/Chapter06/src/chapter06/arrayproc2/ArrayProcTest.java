package chapter06.arrayproc2;

public class ArrayProcTest {

	public static void main(String[] args) {
		ArrayProc array= new ArrayProc(5);
		array.getValues();
		System.out.println(array.getSum());
		System.out.println(array.getAverage());
		System.out.println(array.getMax());
		System.out.println(array.getMin());
		System.out.println(array.toString());
		
	}

}
