package chapter15.map;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String,Student> hm = new HashMap<String, Student>();
		hm.put("1", new Student(1,"����ǥ"));
		hm.put("2", new Student(2,"����ǥ"));
		hm.put("3", new Student(3,"����ǥ"));
		
		
		System.out.println(hm);
		//����
		hm.remove("1");
		System.out.println(hm);
		//��ü
		hm.put("3",new Student(3,"������"));
		System.out.println(hm);
		//���� for���� (���� Set���� �ٲپ �׾ȿ� ����Ÿ�� �����°�)
		//��.hm.entrySet() ->���� Set<Entry<String,Student>> 
		for(Entry<String, Student> set :hm.entrySet()) {
			String str= set.getKey();
			Student stu =set.getValue();
			System.out.println(str+" = "+stu.name + stu.num);
		}
	}

}
