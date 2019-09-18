package chapter17.ttest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		File file = new File("Students.dat");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ArrayList<Data> list = new ArrayList<Data>();
		
		list.add(new Data("���浿", "1����", "1��"));
		list.add(new Data("�̱浿", "2����", "2��"));
		list.add(new Data("��浿", "3����", "3��"));
		list.add(new Data("ȫ�浿", "4����", "4��"));
		list.add(new Data("�ڱ浿", "5����", "5��"));
		
		oos.writeObject(list);
		if(oos != null) {
			oos.close();
		}
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<Data> list2 = (ArrayList<Data>)ois.readObject();
		boolean find = false;
		Data dt = null;
		for(int i=0;i<list2.size();i++) {
			System.out.println(list2.get(i));
			
			if(list2.get(i).name.equals("ȫ�浿")) {
				
				dt=list2.get(i);
				find = true;
			}
		}
		if(find == false) {
			System.out.println("������");
		}
		System.out.println("\n"+"ã�Ҵ� !!" + dt);
			ois.close();
	}
}
