package chapter05.student;

public class StudentTest {

	public static void main(String[] args) {
		Student stu=new Student();
		Student stu2=new Student("서연우",15,"남자",100);
		
		stu.setName("심재현");
		stu.setNumber(13);
		stu.setGender("남자");
		stu.setScore(100);
		
		System.out.println(stu.getName()+stu.getNumber()+stu.getGender()+stu.getScore());
		System.out.println(stu2.toString());
		stu.nameScorePrint();
		stu2.nameScorePrint();
				
	}

}
