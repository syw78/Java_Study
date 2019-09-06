package chapter15.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector vc =new Vector();
		MyClass mc= new MyClass(0);
		//벡터에 삽입
		vc.add(new String("Hello World!"));
		vc.add(new Integer(10));
		vc.add(mc);
		vc.add(1, "Hello");
		
		//요소 출력
		Iterator iter = vc.iterator();
		while(iter.hasNext()) {
			Object oba=iter.next();
			System.out.println(oba);
		}
		System.out.println("================");
		
		
		for(int i=0;i<vc.size();i++) {
			System.out.println(i+" = "+vc.get(i));
		}
		
		System.out.println("====================");
		int j=0;
		
		for(Object o : vc) {
			System.out.println((j++)+" = "+o);
		}
		System.out.println("====================");
	
		//요소삭제 위치로도되고 객체로도된다?
		System.out.println("요소삭제");
		vc.remove(0);
		for(int i=0;i<vc.size();i++) {
			System.out.println(i+" = "+vc.get(i));
		}
	
		//요소삭제2
		System.out.println("요소삭제2");
		vc.remove(mc);
		for(int i=0;i<vc.size();i++) {
			System.out.println(i+" = "+vc.get(i));
		}
		
	}

}
