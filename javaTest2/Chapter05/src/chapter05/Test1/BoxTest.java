package chapter05.Test1;

public class BoxTest {

	public static void main(String[] args) {
		Box box=new Box();
		
		box.setwihth(20);
		box.setlength(40);
		box.setheight(40);
			
		System.out.println("������ ����"+box.getwihth()+"������ ����"+box.getlength()+"������ ����"+box.getheight());
		System.out.println("������ ����"+box.boxVolume());
	}


}
