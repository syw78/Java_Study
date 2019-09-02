package chapter05.student2;

public class StudentTest {

	public static void main(String[] args) {
		//1.객체생성 (디폴트 , 매개변수4)
		Student stu1= new Student();
		Student stu2=new Student("크래커 ",28,"남성",100);
		
		//2.stu1 객체를 값을 셋팅한다
		stu1.setName("핸드워시 "); stu1.setNo(29); stu1.setGender("남성"); stu1.setScore(90);
		
		//3 stu1.객체를 getter 출력한다.
		
		System.out.println(stu1.getName());
		System.out.println(stu1.getNo());
		System.out.println(stu1.getGender());
		System.out.println(stu1.getScore());
		//4.stu2 객체를 toString 출력한다.
		System.out.println(stu2.hashCode());
		System.out.println(stu2);
		//5. stu1, stu2 이름과 평점을 출력한다.
		stu1.printNameScore();
		stu2.printNameScore();
	}
	
}
