package chapter07.ex9;

public class PersonTest {

	public static void main(String[] args) {
		Person per = new Person();
		Customer cu = new Customer("13","����Ĩ","0103333333");
		per.setName("ȫ�浿");
		per.setAddress("��õ");
		per.setNumber("0100000000");
		
		System.out.println(per.getAddress());
		System.out.println(per.getName());
		System.out.println(per.getNumber());
		
		cu.setAddress("����");
		cu.setMileage(5000);
		System.out.println(cu.getAddress());
		System.out.println(cu.getCuNumber());
		System.out.println(cu.getMileage());
		System.out.println(cu.getName());
		System.out.println(cu.getNumber());
		
		
		
	}

}
