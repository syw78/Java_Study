package chpater15.ex18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class LottoTest {

	public static void main(String[] args) {
//		1. HashSet사용 HashSet<Integer> set= new HashSet<Integer>();
//		2.Math.random() 사용하고 (1~45 숫자를 정한다.)
//		3.HashSet contains()메소드를 이용하라.(선택된 정수인지 검사)
		HashSet<Integer> set= new HashSet<Integer>();
		while(true) {
			int num=(int)(Math.random()*(45-1+1)+1);
			if(!set.contains(new Integer(num))){
				set.add(new Integer(num));				
			}				
			if(set.size() ==6) break;
		}
		// set.contains(Object) 이거는 오브젝트가  셋안에 있는지 확인하는 함수
		//출력하기
		for( Integer integer : set ) {
			System.out.println(integer);
		}
		System.out.println("========");
		// set -> treeset convert
		TreeSet<Integer> tset = new TreeSet<Integer>(set);
		// set -> arrayList
		List<Integer> list =new ArrayList<Integer>(set);
		Collections.sort(list);
		
		Iterator<Integer> iterator =list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
