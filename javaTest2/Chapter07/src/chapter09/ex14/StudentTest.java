package chapter09.ex14;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student("홍길동", 1234, "컴공", 2, 21);
		System.out.println(student);

		UnderGraduate under = new UnderGraduate("황길동", 1232, "시컴", 3, 21, "축구부");
		System.out.println(under);

		Graduate grad = new Graduate("장길동", 1233, "생활체육", 3, 21, "연구조교", 30.0);
		System.out.println(grad);
	}

}
