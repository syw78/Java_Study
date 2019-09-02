package chapter09.anonymous;

public class ATest {

	public static void main(String[] args) {
		B b = new A();
		b.turnOn();
		b.turnOff();
	
		B b1 = new B() {
			int a=10;
			@Override
			public void turnOn() {
				System.out.println("��Ű����"+a);
			}

			@Override
			public void turnOff() {
				System.out.println("�Ҳ�����");
			}
		};
		b1.turnOn();
		b1.turnOff();
		
		B b2= new B() {
			public void turnOn() {
				System.out.println("��Ű����!!!!!");
			}
			public void turnOff() {
				System.out.println("�Ҳ�����!!!!!");
			}
			
		};
		b2.turnOn();
		b2.turnOff();
		
		
		
		
	}
}
