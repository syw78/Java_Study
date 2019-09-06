package chapter15.map;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String,Student> hm = new HashMap<String, Student>();
		hm.put("1", new Student(1,"구준표"));
		hm.put("2", new Student(2,"김준표"));
		hm.put("3", new Student(3,"박준표"));
		
		
		System.out.println(hm);
		//제거
		hm.remove("1");
		System.out.println(hm);
		//대체
		hm.put("3",new Student(3,"소이정"));
		System.out.println(hm);
		//향상된 for문을 (맵을 Set으로 바꾸어서 그안에 데이타를 가져온것)
		//맵.hm.entrySet() ->맵을 Set<Entry<String,Student>> 
		for(Entry<String, Student> set :hm.entrySet()) {
			String str= set.getKey();
			Student stu =set.getValue();
			System.out.println(str+" = "+stu.name + stu.num);
		}
	}

}
