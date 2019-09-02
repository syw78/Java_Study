package chapter07.ex8;

public class TestCylinder {

	public static void main(String[] args) {
		Cylinder obj1 = new Cylinder();
		System.out.println(obj1.getArea()+" "+obj1.getHeight()+" "+obj1.getRadius()+" "+obj1.getVolume());
		
		Cylinder obj2= new Cylinder(5.0,3.0);
		System.out.println(obj2.getArea());
		System.out.println(obj2.getHeight());
		System.out.println(obj2.getRadius());
		System.out.println(obj2.getVolume());
		
	}

}
