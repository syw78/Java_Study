package chapter09.anonymous;

public class A implements B{
	public int start =10;
	
	@Override
	public void turnOn() {
		System.out.println("불켜라"+start);
	}@Override
	public void turnOff() {
		System.out.println("불꺼라");
	}
}
