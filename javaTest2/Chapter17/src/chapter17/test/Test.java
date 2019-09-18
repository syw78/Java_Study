package chapter17.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<Data> list = new ArrayList<Data>();

		File file = new File("student.dat"); 									//직렬화 한다.
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		list.add(new Data("1번지", "1월", "장길동"));
		list.add(new Data("2번지", "2월", "홍길동"));
		list.add(new Data("3번지", "3월", "이길동"));
		list.add(new Data("4번지", "4월", "박길동"));
		list.add(new Data("5번지", "5월", "김길동"));
		Data no = null;

		oos.writeObject(list);
		if (oos != null) {
			oos.close();
		}
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<Data> list2 = (ArrayList<Data>) ois.readObject();
		boolean find = false;
//		Iterator<Data> iter = list2.iterator();
//		boolean find = false;
//		while(iter.hasNext()) {
//			Data data=iter.next();
//			System.out.println(data);
//			
//			if(data.name.equals("홍길동")) {
//				System.out.println("찾았다:"+data);
//				find = true;
//			}
//		}
		
//		Data saveObj = null;
//		for(int i=0;i<list2.size();i++) {
//			System.out.println(list2.get(i));
//			if(list2.get(i).name.equals("홍길동")) {
//				saveObj = list2.get(i);
//				find = true;									for문 
//			}
//		}
//		System.out.println("Find : " + saveObj);
		
		
		if(find ==false) {
			System.out.println("없어유ㅠ");
		}
		ois.close();
	}
}
