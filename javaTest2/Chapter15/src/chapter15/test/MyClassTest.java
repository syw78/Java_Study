package chapter15.test;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass[] mc1= {new MyClass(10,"�����"),new MyClass(20,"����"),new MyClass(30,"�ҵ���")};
		
		MyClass mcResult=MyMethod.getMax(mc1);
		System.out.println(mcResult);
	}

	

}
