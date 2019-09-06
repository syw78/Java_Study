package chapter15.p977;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListTest {

	public static void main(String[] args) {
		new ArrayList<String>();
		ArrayList<String> al = new ArrayList<String>();
		
		//삽입
		al.add("milk");
		al.add("bread");
		al.add("butter");
		al.add(1, "apple");
		
		
		
		//제거
	//	al.remove("butter");
		
		int j=0;
		for(String str :al) {    //Object도 가능
			System.out.println((j++)+"="+str);
		}
		System.out.println("==============");
		for(int i=0;i<al.size();i++) {
			System.out.println(i+"="+al.get(i));
		}
		System.out.println("==============");
		//반복자 처리
		Iterator<String> iter =al.iterator();
		//2.반복자 내용유무 물어본다.
		while(iter.hasNext()) {
			//3.반복자 내용을 가져온다
			System.out.println(iter.next());
		}
		
	}

}
