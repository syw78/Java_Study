package chapter06.ex26;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp= new Employee();
		
		System.out.println(emp.toString());
		emp.setName("¼­¿¬¿ì");
		emp.setNumber("01082564933");
		emp.setAnnualIncome(8000);
		
		System.out.println(emp.toString());
	}

}
