package chapter05.ex7;

public class DogTest {

	public static void main(String[] args) {
		Dog dog = new Dog();
		
		dog.setBreed("Áøµ¾°³");
		dog.setAge(2);
		dog.setColor("ÇÏ¾á»ö");
		
		dog.barking();
		dog.hungry();
		dog.sleeping();
	}
}
