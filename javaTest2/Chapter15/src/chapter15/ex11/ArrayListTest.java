package chapter15.ex11;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
	
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
