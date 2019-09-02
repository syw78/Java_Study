package chapter06.ex30;

public class PlaneTest {

	public static void main(String[] args) {
		Plane plane = new Plane();
		Plane plane2= new Plane();
		Plane plane3= new Plane(null,10);
		
		plane.setAirline("ASIANA");
		plane.setModel("A380-800");
		plane.setPassenger(500);
		System.out.println(plane.getAirline()+" "+plane.getModel()+" "+plane.getPassenger());
		
		plane2.setAirline("AirBusan");
		plane2.setModel("A380-500");
		plane2.setPassenger(300);
		System.out.println(plane2.getAirline()+" "+plane2.getModel()+" "+plane2.getPassenger() );
		
		System.out.println(plane.getPlanes());
		
	}

}
