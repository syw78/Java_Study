package chapter09.ex14;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student("ȫ�浿", 1234, "�İ�", 2, 21);
		System.out.println(student);

		UnderGraduate under = new UnderGraduate("Ȳ�浿", 1232, "����", 3, 21, "�౸��");
		System.out.println(under);

		Graduate grad = new Graduate("��浿", 1233, "��Ȱü��", 3, 21, "��������", 30.0);
		System.out.println(grad);
	}

}
