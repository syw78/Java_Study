package chapter07.ex7;

public class B extends A {
	public void f(A a) {
		System.out.println("fb(A)");
	}
	public void f(B b) {
		System.out.println("fb(B)");
	}
}
