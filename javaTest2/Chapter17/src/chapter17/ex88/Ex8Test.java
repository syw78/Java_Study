package chapter17.ex88;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ex8Test {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("kongbab.dat");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ArrayList<Students> list = new ArrayList<Students>();
		
		int no = 1;
		while(true) {
			System.out.println("이름입력요망");
			String name = scan.nextLine();
			list.add(new Students(no, name));
			no++;
			System.out.println("계속할거요?");
			String choice = scan.nextLine();
			if(choice.equals("N")||choice.equals("n")) {
				break;
			}
		}
		oos.writeObject(list);
		if(oos!=null) {
			oos.close();
		}
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<Students> list2 = (ArrayList<Students>)ois.readObject();
		
		Iterator<Students> iter = list2.iterator();
		boolean find = false;
		while(iter.hasNext()) {
			Students stu = iter.next();
			if(stu.no==2) {
				System.out.println(stu);
				find = true;
				break;
			}
		}
		if(find==false) {
			System.out.println("없어요 ㅠ");
		}
		if(ois!=null) {
			ois.close();
		}
	}
}
