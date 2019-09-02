package chapter06.arrayproc;

public class ArrayProcTest {

	public static void main(String[] args) {
		ArrayProc array = new ArrayProc(5, 0, 0.0);
		array.getValues();
		System.out.println(array.getSum());
		System.out.println(array.getAverage());
	}

}
