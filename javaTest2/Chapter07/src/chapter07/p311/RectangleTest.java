package chapter07.p311;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rec1= new Rectangle();
		Rectangle rec2= new Rectangle();
		
		rec1.setX(5);
		rec1.setY(3);
		rec1.setWidth(10);
		rec1.setHeight(20);
		
		rec2.setX(8);
		rec2.setY(9);
		rec2.setWidth(11);
		rec2.setHeight(21);
		
		rec1.print();
		rec1.draw();
		System.out.println("�簢���� ����="+rec1.area());
		
		rec2.print();
		rec2.draw();
		System.out.println("�簢���� ����="+rec2.area());
		
	}

}