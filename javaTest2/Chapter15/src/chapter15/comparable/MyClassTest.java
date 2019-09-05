package chapter15.comparable;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass<MyClass> mc1 =new MyClass<MyClass>(10,"홍길동");
		MyClass<MyClass> mc2 =new MyClass<MyClass>(20,"저길동");
		
		int value=mc1.compareTo(mc2);
		
		switch(value) {
		case 1: System.out.println(mc1+"큽니다"); break;
		case -1: System.out.println(mc2+"큽니다"); break;
		case 0: System.out.println("같습니다."); break;
		default : System.out.println("정신차려");
		}
		
		MyClass[] mcArray= {new MyClass<MyClass>(10, "홍길동"),
				new MyClass<MyClass>(20, "저길동"),
				new MyClass<MyClass>(30, "이길동")
				,new MyClass<MyClass>(40, "서길동")};
		
		MyClass largeObject= MyArrayAlg.getMax(mcArray);
		System.out.println(largeObject+"가장큰객체입니다.");
		
		String[] strArray = {new String("하길동"),new String("저길동"),new String("크길동")};

		String largeString= MyArrayAlg.getMax(strArray);
		System.out.println(largeString+"가장큰객체입니다.");
		
	}

}
