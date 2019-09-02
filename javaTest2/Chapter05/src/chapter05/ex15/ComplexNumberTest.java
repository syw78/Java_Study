package chapter05.ex15;

public class ComplexNumberTest {

	public static void main(String[] args) {
		ComplexNumber com=new ComplexNumber();
		
		com.setReal(5);
		com.setImag(3);
		System.out.println(com.complexNum(2));
	}

}
