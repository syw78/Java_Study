package chapter05.student;

public class StudentTest {

	public static void main(String[] args) {
		Student stu=new Student();
		Student stu2=new Student("������",15,"����",100);
		
		stu.setName("������");
		stu.setNumber(13);
		stu.setGender("����");
		stu.setScore(100);
		
		System.out.println(stu.getName()+stu.getNumber()+stu.getGender()+stu.getScore());
		System.out.println(stu2.toString());
		stu.nameScorePrint();
		stu2.nameScorePrint();
				
	}

}
