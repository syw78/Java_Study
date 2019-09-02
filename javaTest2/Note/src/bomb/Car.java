package bomb;

public class Car extends Bomb {
	public Car() {
		super();
	}

	public void bomb() {
		System.out.println("자동차 폭파");
	}

	public static void sbomb() {
		System.out.println("Car의 정적 메소드입니다.");
	}
}
