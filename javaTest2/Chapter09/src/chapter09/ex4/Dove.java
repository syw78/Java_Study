package chapter09.ex4;

public class Dove extends Bird {

	public void sound() {
		System.out.println("coo coo");
	}
	
	public static void main(String[] args) {
		
		Dove dove = new Dove();
		
		dove.sound();
		
	}

}
