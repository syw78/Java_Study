package chapter06.employee;

public class Employee {

	// 1.�������(�����������/�ν��ͽ�������� )
	private static int count = 0;
	private double salary;
	private String name;

	// 2.������ �����ε�(����Ʈ������,�Ű�����������)

	public Employee() {
		this(0.0, null);
	}
	public Employee(double salary, String name) {
	
		this.salary=salary;
		this.name=name;
		Employee.count++;
	}
	// 3.�������̵�
	@Override
	protected void finalize() {       //throws Throwable {         //����ó�� �Ǿ��ִ�.
		System.out.println("�� �������� ... ���� �޸𸮿��� ������ϴ�.");
		this.count--;
		B b = new B();
		System.out.println(b.a);
	}
	 
	
	// 4 getter �Լ� ����
	public static int getCount() {
		return count;
	}
	public static class B{
		int a = 10;
	
	}
	
	
	
	
}

















