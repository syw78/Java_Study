package chapter15.ex17;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentTest {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();

		// �����Է�

		list.add(new Student("�輺��", "������", "12345678"));
		list.add(new Student("������", "���ı�", "12345678"));
		list.add(new Student("������", "���", "12345678"));
		// �����˻�
		Iterator<Student> iter = list.iterator();
		boolean tag = false;
		while (iter.hasNext()) {
			Student stu = iter.next();
			if (stu.getName().equals("������")) {
				tag = true;
				System.out.println(stu.getName() + "�л��� �ֽ��ϴ�.");
				System.out.println("�������� " + stu.getAdress() + stu.getPhone());
			}

		}
		if (tag == false) {
			System.out.println("������ �л��� �����ϴ�.");
		}

		// �������
		Iterator<Student> iter2 = list.iterator();
		while (iter2.hasNext()) {
			Student stu = iter2.next();
			if (stu.getName().equals("������")) {
				iter2.remove();
			}
		}
		//����ϴ±��
		for(Student stu:list) {
			System.out.println(stu);
		}

	}
}
