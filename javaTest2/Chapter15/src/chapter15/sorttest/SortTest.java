package chapter15.sorttest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortTest {

	public static void main(String[] args) {
		// 1. ���ڹ迭4������
		String[] str = new String[] {"zzz","bbb","ccc","ddd"};
		// 2. �迭�� List�� �ٲ㺸����.
		
		List<String> list =Arrays.asList(str);
		
		// 4. List�� �����Ѵ�.
		iterR(list);
		Collections.sort(list);
		System.out.println("����==========");
		iterR(list);
	
		System.out.println("����==========");
		str = (String[])(list.toArray());
		for(String ss :str) {
			System.out.println(ss);
		}
		
	}

	public static void iterR(List list) {
		// 3. list iterator ����غ�����.
		Iterator<String> iter =list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
