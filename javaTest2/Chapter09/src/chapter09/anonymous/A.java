package chapter09.anonymous;

public class A implements B{
	public int start =10;
	
	@Override
	public void turnOn() {
		System.out.println("���Ѷ�"+start);
	}@Override
	public void turnOff() {
		System.out.println("�Ҳ���");
	}
}
