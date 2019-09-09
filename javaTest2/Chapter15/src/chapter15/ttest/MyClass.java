package chapter15.ttest;

public class MyClass implements Comparable<MyClass>  {
	private int number;
	private String name;
	
	
	public MyClass(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	@Override
	public int compareTo(MyClass mc) {
		MyClass a = null;
		if(mc instanceof MyClass) {
			a=(MyClass)mc;
		}
		if(this.number>mc.number) {
			return 1;
		}
		if(this.number<mc.number) {
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
