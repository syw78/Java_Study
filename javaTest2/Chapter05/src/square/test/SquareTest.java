package square.test;

public class SquareTest {

	public static void main(String[] args) {
		int a = 10;
		int[] A = new int[] {1,2,3};
		Square s= new Square();
		
		a=A[0];
		s.setheight(10);
		s.setwidth(20);
		
		System.out.println(s.getheight()+" "+s.getwidth());
		
		System.out.println(s.squareDis());
		System.out.println(s.squareArea());
		
	}

}
