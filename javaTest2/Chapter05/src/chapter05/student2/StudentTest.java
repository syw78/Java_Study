package chapter05.student2;

public class StudentTest {

	public static void main(String[] args) {
		//1.��ü���� (����Ʈ , �Ű�����4)
		Student stu1= new Student();
		Student stu2=new Student("ũ��Ŀ ",28,"����",100);
		
		//2.stu1 ��ü�� ���� �����Ѵ�
		stu1.setName("�ڵ���� "); stu1.setNo(29); stu1.setGender("����"); stu1.setScore(90);
		
		//3 stu1.��ü�� getter ����Ѵ�.
		
		System.out.println(stu1.getName());
		System.out.println(stu1.getNo());
		System.out.println(stu1.getGender());
		System.out.println(stu1.getScore());
		//4.stu2 ��ü�� toString ����Ѵ�.
		System.out.println(stu2.hashCode());
		System.out.println(stu2);
		//5. stu1, stu2 �̸��� ������ ����Ѵ�.
		stu1.printNameScore();
		stu2.printNameScore();
	}
	
}
