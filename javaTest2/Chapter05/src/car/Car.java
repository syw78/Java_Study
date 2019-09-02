package car;

public class Car {

	private String color;
	private int gear;
	private int speed;

	public Car(String color, int gear, int speed) {

		this.color = color;
		this.gear = gear;
		this.speed = speed;
	}

	public void changeGear(int gear) {
		this.gear=gear;
	}
	public void speedUp(int speed) {
		this.speed=this.speed+speed;
	}
	public void speedDown(int speed) {
		this.speed=this.speed-speed;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public void setGear(int gear) {

		this.gear = gear;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	public String getColor() {
		return color;
	}
	public int getGear() {
		return gear;
	}
	public int getSpeed() {
		return speed;
	}
}
