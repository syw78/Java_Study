package chapter15.ex17;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentTest {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();

		// 정보입력

		list.add(new Student("김성민", "오동동", "12345678"));
		list.add(new Student("유영삼", "송파구", "12345678"));
		list.add(new Student("정민지", "잠실", "12345678"));
		// 정보검색
		Iterator<Student> iter = list.iterator();
		boolean tag = false;
		while (iter.hasNext()) {
			Student stu = iter.next();
			if (stu.getName().equals("정민지")) {
				tag = true;
				System.out.println(stu.getName() + "학생이 있습니다.");
				System.out.println("정보제공 " + stu.getAdress() + stu.getPhone());
			}

		}
		if (tag == false) {
			System.out.println("정민지 학생이 없습니다.");
		}

		// 삭제기능
		Iterator<Student> iter2 = list.iterator();
		while (iter2.hasNext()) {
			Student stu = iter2.next();
			if (stu.getName().equals("정민지")) {
				iter2.remove();
			}
		}
		//출력하는기능
		for(Student stu:list) {
			System.out.println(stu);
		}

	}
}
