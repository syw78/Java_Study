package chapter14.ex09;

public class Test {

	public static void main(String[] args) {
		try {
			someMethod();
			System.out.println("A");
		}catch(Exception e) {
			System.out.println("B"); // 오류가 없기 때문에 
		}finally {						//catch 가 작용을 안해서 A C D 가 출력된다	
			System.out.println("C");
		}
		System.out.println("D");
	}
	public static void someMethod() {}
}
