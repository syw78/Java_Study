package chapter17.ex8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ex8 {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String [] args) throws IOException, ClassNotFoundException {
		
		File file = new File("gimbab.dat");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ArrayList<Students> list = new ArrayList<Students>();
		int no=1;
		
		while(true) {
			System.out.println("�̸��Է¿��");
			String name =scan.nextLine();
			list.add(new Students(no,name));
			no++;
			System.out.println("����ϰڽ��ϱ�?Y/N");
			String go = scan.nextLine();
			if(go.equals("N")||go.equals("n")) {
				break;	
			}			
		}
		oos.writeObject(list);
		if(oos!=null) {oos.close();}
		//������ȭ ���
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<Students> list2 =(ArrayList<Students>)ois.readObject();
		
		Iterator<Students> iterator =list2.iterator();
		boolean find = false;
		while(iterator.hasNext()) {
			Students stu=iterator.next();
			if(stu.no==2) {
				System.out.println(stu);
				find = true;
				break;
			}
		}//end of while
		if(find == false) {
			System.out.println("�����٤�");
		}
		if(ois!=null) {
			ois.close();
		}
	}
	
	
}
