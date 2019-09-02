package chapter06.circle;

public class CircleTest {

	public static void main(String[] args) {
		Point po = new Point(10, 10);
		Circle ci = new Circle(po, 10);
		System.out.println(po.toString());
		System.out.println(ci.toString());
	}

}
