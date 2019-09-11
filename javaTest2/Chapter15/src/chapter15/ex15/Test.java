package chapter15.ex15;

public class Test {

	public static void main(String[] args) {
		
		Object obj = method(10);
		Object obj2 = method(10.1);
		Object obj3 = method("aa");
		System.out.println(obj.getClass().getName());
		System.out.println(obj2.getClass().getName());
		System.out.println(obj3.getClass().getName());
	}
	public static <T> T method (T a) {
		T t = a;
		
		return t;
	}
}
