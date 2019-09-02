package chapter02;

public class BooleanTest {
	public static void main(String[]args) {
		boolean bool ;
		//1.부울형 변수를 선언한다.(bool)
		//2.부울형 변수의 값을 할당한다.(true)
		//3.부울형값을 출력한다.(println)
		//4.비교값을 진행한다. 1이 2보다 크냐 를 물어본 결과값을 저장한다.
		//5.결과값을 출력한다.
		bool=true;
		System.out.println("부울형의 값"+bool);
		bool=(1>2);
		System.out.println("비교후 값"+bool);
		
	}

}
