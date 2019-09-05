package chapter14.ex1;

public class ExampleTest {

	public static void main(String[] args) {
		int[] list=null;
		try {
		list[0] = 0;
		}catch(NullPointerException e) {
			System.out.println("¿À·ù");
			e.printStackTrace();
		}
	}

}
