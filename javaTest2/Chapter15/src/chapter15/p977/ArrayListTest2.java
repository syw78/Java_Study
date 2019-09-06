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
		
		//1. �÷��ǿ��� ���ͷ����͸� ������. �ݵ�� �ش�� Ŭ���� Ÿ������ �޾ƶ�
		Iterator<MyClass> iter= list.iterator();
		//2. �ݺ����� ���ؼ� ��ü�� ������ �ִ��� ���� Ȯ�� hasNext() : �� ������ü �ٰ� �־�?
		while(iter.hasNext()) {
			//3. ��ü �ּ���!
			MyClass mc1 = iter.next();
			System.out.println(mc1.a);
			
		}
		
	
	}

}
