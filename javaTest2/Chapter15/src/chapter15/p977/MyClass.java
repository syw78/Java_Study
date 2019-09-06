package chapter15.p977;

public class MyClass {

	public int a;

	public MyClass(int a) {
		super();
		this.a = a;
	}

	@Override
	public String toString() {
		return super.toString()+"\n"+"MyClass [a=" + this + "]";
	}
}
