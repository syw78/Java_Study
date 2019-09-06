package chapter15.test;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass[] mc1= {new MyClass(10,"어려워"),new MyClass(20,"젠장"),new MyClass(30,"소독제")};
		
		MyClass mcResult=MyMethod.getMax(mc1);
		System.out.println(mcResult);
	}

	

}
