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
				System.out.println("불키세요"+a);
			}

			@Override
			public void turnOff() {
				System.out.println("불끄세요");
			}
		};
		b1.turnOn();
		b1.turnOff();
		
		B b2= new B() {
			public void turnOn() {
				System.out.println("불키세요!!!!!");
			}
			public void turnOff() {
				System.out.println("불끄세요!!!!!");
			}
			
		};
		b2.turnOn();
		b2.turnOff();
		
		
		
		
	}
}
