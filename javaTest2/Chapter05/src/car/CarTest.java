package car;

public class CarTest {

	public static void main(String[] args) {
		Car car= new Car("red",2,80);
		
		System.out.println(car.getColor()+" "+car.getGear()+" "+car.getSpeed());
		car.speedUp(2);
		car.changeGear(4);
		car.speedDown(1);
		
		System.out.println("���� "+car.getColor()+"��� "+car.getGear()+" "+"���ǵ� "+car.getSpeed());
		
	}

}
