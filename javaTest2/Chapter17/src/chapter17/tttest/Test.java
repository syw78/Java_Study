package chapter17.tttest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File file = new File("students.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ArrayList<Data> list = new ArrayList<Data>();
		
		list.add(new Data("크래커","3번지","3월"));
		list.add(new Data("아이비","4번지","4월"));
		list.add(new Data("촘크래커","5번지","5월"));
		
		oos.writeObject(list);
		if(oos!=null) {
			oos.close();
		}
	
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<Data> list2 = (ArrayList<Data>)ois.readObject();
		boolean find = false;
		Data dt = null;
		for(int i=0;i<list2.size();i++) {
			System.out.println(list2.get(i));
	
			if(list2.get(i).name.equals("아이비")) {
				dt=list2.get(i);
				find = true;
			}
		}
		if(find==false) {
			System.out.println("없어유");
		}
		System.out.println(dt);
		ois.close();
		
	}

}
