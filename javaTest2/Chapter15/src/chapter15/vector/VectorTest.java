package chapter15.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector vc =new Vector();
		MyClass mc= new MyClass(0);
		//���Ϳ� ����
		vc.add(new String("Hello World!"));
		vc.add(new Integer(10));
		vc.add(mc);
		vc.add(1, "Hello");
		
		//��� ���
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
	
		//��һ��� ��ġ�ε��ǰ� ��ü�ε��ȴ�?
		System.out.println("��һ���");
		vc.remove(0);
		for(int i=0;i<vc.size();i++) {
			System.out.println(i+" = "+vc.get(i));
		}
	
		//��һ���2
		System.out.println("��һ���2");
		vc.remove(mc);
		for(int i=0;i<vc.size();i++) {
			System.out.println(i+" = "+vc.get(i));
		}
		
	}

}
