package chapter15.ex4;

import java.util.Iterator;
import java.util.TreeSet;

public class Test {
	int s;
	public static void main(String[] args) {
		TreeSet map = new TreeSet();  //Ʈ������ �˾Ƽ� ũ�� ������ �ؼ� �Էµȴ�.
		
		map.add("one");
		map.add("two");
		map.add("three");
		map.add("four");
		map.add("one");          
		Iterator it = map.iterator(); //���ͷ����� == �ݺ���
		while(it.hasNext()) { //���������Ͱ� �ֳ� ���������� ��� �̾Ƴ���.
			System.out.println(it.next()+" ");
		}
	}

}
