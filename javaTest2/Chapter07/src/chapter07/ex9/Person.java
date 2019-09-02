package chapter07.ex9;

public class Person {
	private String name;
	private String address;
	private String number;
	
	public Person() {
		super();
	}
	public Person(String name,String address, String number) {
		
		this.name=name;
		this.address=address;
		this.number=number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
}
