package chapter15.p977;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest2 {

	public static void main(String[] args) {
//		ArrayList<MyClass> al =new ArrayList<MyClass>();
//		al.add(new MyClass(10));
//		al.add(new MyClass(20));
//		al.add(new MyClass(30));
//		al.add(new MyClass(40));
//		al.add(new MyClass(50));
		MyClass[] mc = {new MyClass(10),new MyClass(20),new MyClass(30)};
		List<MyClass> list =Arrays.asList(mc);
		
		//1. 컬렉션에서 이터레이터를 만들어라. 반드시 해당된 클래스 타입으로 받아라
		Iterator<MyClass> iter= list.iterator();
		//2. 반복문을 통해서 객체를 가지고 있는지 유무 확인 hasNext() : 너 다음객체 줄게 있어?
		while(iter.hasNext()) {
			//3. 객체 주세요!
			MyClass mc1 = iter.next();
			System.out.println(mc1.a);
			
		}
		
	
	}

}
