package chapter15.ex17;

public class Student implements Comparable{
	
	private String name;
	private String adress;
	private String phone;
	//	학생의 이름,
	//	주소
	//	전화번호
	//	접근자
	//	설정자
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public Student(String name, String adress, String phone) {
		super();
		this.name = name;
		this.adress = adress;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", adress=" + adress + ", phone=" + phone + "]";
	}
	@Override
	public int compareTo(Object obj) {
		Student stu=null;
		if(obj instanceof Student) {
			stu=(Student)obj;
		}
		return phone.compareTo(stu.phone);		
	}
	
	
	
	
	

}	
