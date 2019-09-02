package chapter09.newcomparable;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(10, 20);
		Rectangle rec2 = new Rectangle(20, 20);

		System.out.println(rec1);
		System.out.println(rec2);

		int returnValue = rec1.compareTo(rec2);

		switch (returnValue) {
		case 1:
			System.out.println("객체1이 큼");
			break;
		case -1:
			System.out.println("객체2가 큼");
			break;
		case 0:
			System.out.println("객체1과 객체2가 같다");
			break;
		default:
			System.out.println("어디로가야하죠 아저씨");
		}
	}
}
