package chapter06.ex30;

public class Plane {
	
	private String airline;
	private String model;
	private int passenger;
	static int air;
	
	public Plane() {
		this(null,null,0);
	}
	public Plane(String airline,int passenger) {
		this(airline,null,passenger);
	}
	public Plane(String airline,String model,int passenger) {
		this.airline=airline;
		this.passenger=passenger;
		this.model=model;
		air++;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPassenger() {
		return passenger;
	}
	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}
	public  int getPlanes() {
		return air;
	}
	
}
