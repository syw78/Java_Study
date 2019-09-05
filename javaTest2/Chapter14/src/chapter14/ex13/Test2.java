package chapter14.ex13;

public class Test2 {

	public static void main(String[] args)  {
		sub();
	}
	public static void sub() {
		int[] array= new int[10];
		int i= array[10];
		throw new ArrayIndexOutOfBoundsException();
	}

}
