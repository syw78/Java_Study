package chapter07.p309;

public class Eagle extends Animal {

	private String wings;
	
	public String getWings() {
		return wings;
	}
	public void setWings(String wings) {
		this.wings = wings;
	}
	public Eagle() {
		this(null);
	}
	public Eagle(String wings) {
		
		this.wings=wings;
		}
	
	public void fly() {
		System.out.println("fly()가 호출 되었습니다.");
	}
}
