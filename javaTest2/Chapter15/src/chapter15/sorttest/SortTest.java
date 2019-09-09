package chapter15.sorttest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortTest {

	public static void main(String[] args) {
		// 1. 문자배열4개선언
		String[] str = new String[] {"zzz","bbb","ccc","ddd"};
		// 2. 배열을 List로 바꿔보세요.
		
		List<String> list =Arrays.asList(str);
		
		// 4. List를 정렬한다.
		iterR(list);
		Collections.sort(list);
		System.out.println("정렬==========");
		iterR(list);
	
		System.out.println("정렬==========");
		str = (String[])(list.toArray());
		for(String ss :str) {
			System.out.println(ss);
		}
		
	}

	public static void iterR(List list) {
		// 3. list iterator 출력해보세요.
		Iterator<String> iter =list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
