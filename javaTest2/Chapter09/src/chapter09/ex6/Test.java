package chapter09.ex6;

public class Test {

	public static void main(String[] args) {
		Rectangle rec= new Rectangle();
		
		rec.setDimensions(5, 6);
		System.out.println("¸éÀû="+rec.getArea());
		rec.draw();
	}

}
