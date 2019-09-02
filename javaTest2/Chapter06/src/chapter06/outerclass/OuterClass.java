package chapter06.outerclass;

public class OuterClass {
	// 1. �������(�����������,�ν��Ͻ��������)
	private int age;
	private static int sage;

	// 2. �������Ŭ����

	static class StaticClass {
		// .����(�������,����Լ�,������)
		public StaticClass() {

			// age=10; �ν��Ͻ� ������� ������.
			sage = 20;
			// InnerClass inner= new InnerClass(); �ν��Ͻ�����Ŭ���� ������
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
		// .�������,����Լ�,������
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

	// 3.�������Լ�(�����ε�)
	public OuterClass() {

		this(0);
	}

	public OuterClass(int age) {

		this.age = age;
	}

}
