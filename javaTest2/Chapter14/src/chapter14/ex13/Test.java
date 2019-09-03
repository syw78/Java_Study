package chapter14.ex13;

public class Test {

	public static void main(String[] args) {
		sub();
	}
	public static void sub() {
		int[] array= new int[10];
		try {
			int i= array[10];
		}catch (Exception e) {
			System.out.println("오류입니다");
		}finally {
			System.out.println("array[9]까지 가능합니다.");
		}
	}

}
