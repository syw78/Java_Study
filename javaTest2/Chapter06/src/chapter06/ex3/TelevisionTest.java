package chapter06.ex3;

public class TelevisionTest {

	public static void main(String[] args) {
		Television t = new Television();
		
		t.setModel("STV-101");
		String b=t.getModel();
		System.out.println(b);
	}

}
