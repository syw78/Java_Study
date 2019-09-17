package chapter17.object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("object.dat");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Student stu = new Student(10,"홍길동");
		oos.writeObject(stu);
		if(oos!=null) {
			oos.close();
		}
		System.out.println("저장되었습니다.");
		//객체파일을 가져온다.
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student stu2=(Student)ois.readObject();
		System.out.println(stu2);
		
		
	}

}
