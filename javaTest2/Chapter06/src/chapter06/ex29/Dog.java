package chapter06.ex29;

public class Dog {
	private String name;
	private String breed; //퍼블릭대신 프라이빗으로함.
	private int age;

	
	public Dog() {
		
		this(null,null,0);
	}
	public Dog(String name, int age) {
		
		this(name,null,age);
		
	}
	public Dog(String name,String breed, int age) {
		
		this.name=name;
		this.breed=breed;
		this.age=age;
	}
	
	public void printString() {
	
		System.out.println("name="+name+"age="+age);
	
	}
	public void printString2() {
		
		System.out.println("name="+name+"breed="+breed+"age="+age);
	
	}
}
