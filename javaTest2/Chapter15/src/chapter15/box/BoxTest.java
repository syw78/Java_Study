package chapter15.box;

public class BoxTest {

	public static void main(String[] args) {
		Box  b1 = new Box("ȫ�浿");
		b1.setData(new MyData("�δٱ��"));
		MyData md1=(MyData)b1.getData();
		String strName = (String)b1.getData();
		System.out.println(md1.str);
		
		Box b2 = new Box(new Integer(60));
		
		
	}

}
