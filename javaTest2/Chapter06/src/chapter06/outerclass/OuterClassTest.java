package chapter06.outerclass;

public class OuterClassTest {

	public static void main(String[] args) {
		OuterClass.StaticClass staticClass = new OuterClass.StaticClass();
		staticClass.staticMyMethod();
		
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.innerMyMethod();
		
	}

}
