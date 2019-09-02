package chapter06.outerclass;

public class OuterClass {
	// 1. 멤버변수(정적멤버변수,인스턴스멤버변수)
	private int age;
	private static int sage;

	// 2. 멤버내부클래스

	static class StaticClass {
		// .구성(멤버변수,멤버함수,생성자)
		public StaticClass() {

			// age=10; 인스턴스 멤버변수 사용못함.
			sage = 20;
			// InnerClass inner= new InnerClass(); 인스턴스내부클래스 사용못함
			StaticClassB staticClassB = new StaticClassB();
		}

		public void staticMyMethod() {
			sage = 10;
			System.out.println("sage=" + sage);
		}

	}

	static class StaticClassB {
	}

	class InnerClass {
		// .멤버변수,멤버함수,생성자
		public InnerClass() {
			age = 10;
			sage = 10;
			StaticClass staticClass = new StaticClass();
			InnerClassB innerclassb = new InnerClassB();
		}

		public void innerMyMethod() {
			age = 30;
			sage = 40;
			System.out.println("InnerClass age =" + age + "sage=" + sage);
		}
	}

	class InnerClassB {

	}

	// 3.생성자함수(오버로딩)
	public OuterClass() {

		this(0);
	}

	public OuterClass(int age) {

		this.age = age;
	}

}
