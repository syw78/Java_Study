package chapter05.ex7;

public class DogTest {

	public static void main(String[] args) {
		Dog dog = new Dog();
		
		dog.setBreed("������");
		dog.setAge(2);
		dog.setColor("�Ͼ��");
		
		dog.barking();
		dog.hungry();
		dog.sleeping();
	}
}
