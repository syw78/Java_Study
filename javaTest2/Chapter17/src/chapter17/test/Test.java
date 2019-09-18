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

		File file = new File("student.dat"); 									//����ȭ �Ѵ�.
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		list.add(new Data("1����", "1��", "��浿"));
		list.add(new Data("2����", "2��", "ȫ�浿"));
		list.add(new Data("3����", "3��", "�̱浿"));
		list.add(new Data("4����", "4��", "�ڱ浿"));
		list.add(new Data("5����", "5��", "��浿"));
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
//			if(data.name.equals("ȫ�浿")) {
//				System.out.println("ã�Ҵ�:"+data);
//				find = true;
//			}
//		}
		
//		Data saveObj = null;
//		for(int i=0;i<list2.size();i++) {
//			System.out.println(list2.get(i));
//			if(list2.get(i).name.equals("ȫ�浿")) {
//				saveObj = list2.get(i);
//				find = true;									for�� 
//			}
//		}
//		System.out.println("Find : " + saveObj);
		
		
		if(find ==false) {
			System.out.println("��������");
		}
		ois.close();
	}
}
