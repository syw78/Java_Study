package chapter06.ex26;

public class Employee {
	private String name;
	private String number;
	private int annualIncome;
	
	public Employee() {
		name=null;
		number=null;
		annualIncome=0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(int annualIncome) {
		this.annualIncome = annualIncome;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + ", annualIncome=" + annualIncome + "]";
	}
	
}
