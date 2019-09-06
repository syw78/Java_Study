package chapter15.vector;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		HashSet<String> hs2 = new HashSet<String>();
		hs.add("a");
		hs.add("b");
		hs.add("c");
		hs2.add("c");
		hs2.add("d");
		
		iteratorPrint(hs);
		iteratorPrint(hs2);
		hs.addAll(hs2);
		iteratorPrint(hs);
		HashSet<String> retain  = new HashSet<String>();
		retain.retainAll(hs2);
		System.out.println("교집합");
		iteratorPrint(retain);
		
		//출력방법
//		for(String str:hs) {
//			System.out.println(str);
//		}
		
//		System.out.println("============");
//		Iterator<String > iter =hs.iterator();
//		while(iter.hasNext()) {
//			String str=iter.next();
//			System.out.println(str);
//			
//		}
//		System.out.println("============");
//		Iterator<String > iter2 =hs2.iterator();
//		while(iter.hasNext()) {
//			String str=iter.next();
//			System.out.println(str);
//			
//		}
		
	}
	public static void iteratorPrint(HashSet<String> hs) {
		Iterator<String > iter2 =hs.iterator();
		while(iter2.hasNext()) {
			String str=iter2.next();
			System.out.println(str);
			
		}
		System.out.println("========="+hs.getClass().getName());
	}

}
