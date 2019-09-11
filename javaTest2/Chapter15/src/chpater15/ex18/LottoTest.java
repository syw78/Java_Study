package chpater15.ex18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class LottoTest {

	public static void main(String[] args) {
//		1. HashSet��� HashSet<Integer> set= new HashSet<Integer>();
//		2.Math.random() ����ϰ� (1~45 ���ڸ� ���Ѵ�.)
//		3.HashSet contains()�޼ҵ带 �̿��϶�.(���õ� �������� �˻�)
		HashSet<Integer> set= new HashSet<Integer>();
		while(true) {
			int num=(int)(Math.random()*(45-1+1)+1);
			if(!set.contains(new Integer(num))){
				set.add(new Integer(num));				
			}				
			if(set.size() ==6) break;
		}
		// set.contains(Object) �̰Ŵ� ������Ʈ��  �¾ȿ� �ִ��� Ȯ���ϴ� �Լ�
		//����ϱ�
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
