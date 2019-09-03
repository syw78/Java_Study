package chapter07.ex9;

public class Customer extends Person {
	private String cuNumber;
	private int mileage;
	
	public Customer() {
		this(null,null,null);
	}
	public Customer(String cuNumber,String name, String number) {
		super(name,null,number);
		this.cuNumber=cuNumber;
	}
	public String getCuNumber() {
		return cuNumber;
	}
	public void setCuNumber(String cuNumber) {
		this.cuNumber = cuNumber;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
}