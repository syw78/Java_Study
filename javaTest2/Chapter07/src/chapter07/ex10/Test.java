package chapter07.ex10;

public class Test {

	public static void main(String[] args) {
	
		Shape sh= new Shape(2,3);
		Triangle tr= new Triangle(2,3,4,5);
		
		System.out.println(sh.getArea());
		System.out.println(sh.getLength());
		System.out.println(tr.getArea());
		System.out.println(tr.getLength());
		System.out.println(sh.toString());
		
	
		System.out.println(tr.toString());
	
	}

}
