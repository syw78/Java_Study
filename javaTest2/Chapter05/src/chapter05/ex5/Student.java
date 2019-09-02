package chapter05.ex5;

public class Student {

	private String name;
	private String rollno;
	private int age;
	
	public Student() {
		
		name=null;
		rollno=null;
		age=0;
	}
	public Student(String name, String rollno,int age) {
		this.name=name;
		this.rollno=rollno;
		this.age=age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", age=" + age + "]";
	}
	
}
