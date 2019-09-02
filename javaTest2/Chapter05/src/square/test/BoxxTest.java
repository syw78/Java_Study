package square.test;

public class BoxxTest {
                        
	public static void main(String[] args) {
		Boxx box= new Boxx();
		
		box.setheight(20);
		box.setlength(20);
		box.setwidth(30);
		
		System.out.println(box.volumeValue());
	}
}
