package chpatrer15.ex9;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		String[] s= {"사과","배","바나나"};
		ArrayList list = new ArrayList(Arrays.asList(s));
		
		list.add("포도");
		System.out.println(list); //추가
		list.add(2,"자몽"); //2에 자몽 추가
		System.out.println(list);
		System.out.println(list.get(3));//3에있는 것만 출력
		list.remove(1); //1에있는 배 삭제
		System.out.println(list);
		System.out.println(list.contains("사과")); //사과가 있냐없냐 물을때 contains
		System.out.println(list.indexOf("사과"));//사과가 몇번째에 있는지
	}

}
