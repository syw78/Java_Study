package chapter15.p977;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListTest {

	public static void main(String[] args) {
		new ArrayList<String>();
		ArrayList<String> al = new ArrayList<String>();
		
		//����
		al.add("milk");
		al.add("bread");
		al.add("butter");
		al.add(1, "apple");
		
		
		
		//����
	//	al.remove("butter");
		
		int j=0;
		for(String str :al) {    //Object�� ����
			System.out.println((j++)+"="+str);
		}
		System.out.println("==============");
		for(int i=0;i<al.size();i++) {
			System.out.println(i+"="+al.get(i));
		}
		System.out.println("==============");
		//�ݺ��� ó��
		Iterator<String> iter =al.iterator();
		//2.�ݺ��� �������� �����.
		while(iter.hasNext()) {
			//3.�ݺ��� ������ �����´�
			System.out.println(iter.next());
		}
		
	}

}
