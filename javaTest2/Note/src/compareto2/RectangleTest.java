package compareto2;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rec1= new Rectangle(10, 20);
		Rectangle rec2 = new Rectangle(10, 20);
		
		System.out.println(rec1.toString());
		System.out.println(rec2.toString());
		int rect1=rec1.compareTo(rec2);
		
		switch(rect1) {
		
		case 1:
			System.out.println("��ü1 ŭ"); break;
		case -1:
			System.out.println("��ü2 ŭ"); break;
		case 0:
			System.out.println("��ü1�� ��ü2 �Ȱ���"); break;
		}
	}

}
