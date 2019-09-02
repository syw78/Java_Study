package chapter06.employee;

public class Employee {

	// 1.멤버변수(정적멤버변수/인스터스멤버변수 )
	private static int count = 0;
	private double salary;
	private String name;

	// 2.생성자 오버로딩(디폴트생성자,매개변수생성자)

	public Employee() {
		this(0.0, null);
	}
	public Employee(double salary, String name) {
	
		this.salary=salary;
		this.name=name;
		Employee.count++;
	}
	// 3.오버라이딩
	@Override
	protected void finalize() {       //throws Throwable {         //예외처리 되어있다.
		System.out.println("잘 있으세요 ... 저는 메모리에서 사라집니다.");
		this.count--;
		B b = new B();
		System.out.println(b.a);
	}
	 
	
	// 4 getter 함수 진행
	public static int getCount() {
		return count;
	}
	public static class B{
		int a = 10;
	
	}
	
	
	
	
}

















