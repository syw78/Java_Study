package chapter15.ex10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex10 {

	public static void main(String[] args) {
		List<Double> list = new ArrayList<Double>();
		list.add(10.0);
		list.add(20.0);
		list.add(30.0);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("===========");
		for(Double a :list) {
			System.out.println(a);
		}
		System.out.println("===========");
		
		Iterator<Double> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}	
	}

}
