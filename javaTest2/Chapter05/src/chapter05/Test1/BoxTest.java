package chapter05.Test1;

public class BoxTest {

	public static void main(String[] args) {
		Box box=new Box();
		
		box.setwihth(20);
		box.setlength(40);
		box.setheight(40);
			
		System.out.println("상자의 가로"+box.getwihth()+"상자의 세로"+box.getlength()+"상자의 높이"+box.getheight());
		System.out.println("상자의 부피"+box.boxVolume());
	}


}
