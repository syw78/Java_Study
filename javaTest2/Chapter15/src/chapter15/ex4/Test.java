package chapter15.ex4;

import java.util.Iterator;
import java.util.TreeSet;

public class Test {
	int s;
	public static void main(String[] args) {
		TreeSet map = new TreeSet();  //트리셋은 알아서 크기 정렬을 해서 입력된다.
		
		map.add("one");
		map.add("two");
		map.add("three");
		map.add("four");
		map.add("one");          
		Iterator it = map.iterator(); //이터레이터 == 반복자
		while(it.hasNext()) { //다음데이터가 있냐 없을떄까지 계속 뽑아낸다.
			System.out.println(it.next()+" ");
		}
	}

}
