package chapter07.p309;

public class AnimalTest {

	public static void main(String[] args) {
		Animal ani = new Animal();
		Lion lion = new Lion();
		Eagle eagle= new Eagle("n");
		lion.eat();
		eagle.sleep();
		lion.roar();
		ani.eat();
		eagle.sleep();
		eagle.fly();
		System.out.println(eagle.getWings());
		
	}

}
