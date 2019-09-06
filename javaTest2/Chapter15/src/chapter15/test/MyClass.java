package chapter15.test;

public class MyClass implements Comparable<MyClass>{
	private int number;
	private String name;
	public MyClass(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	@Override
	public int compareTo(MyClass o) {
		MyClass mc = null;
		if(o instanceof MyClass) {
			mc=(MyClass)o;
		}
		if(this.number>mc.number) {
			return 1;
		}else if(this.number<mc.number) {
			return -1;
		}else {
			return 0;
		}
	}
	@Override
	public String toString() {
		return "MyClass [number=" + number + ", name=" + name + "]";
	}
	
	
}
