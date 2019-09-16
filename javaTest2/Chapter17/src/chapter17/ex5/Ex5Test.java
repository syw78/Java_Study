package chapter17.ex5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex5Test {

	public static void main(String[] args) throws IOException {
		//파일을 저장하기
		File file2 = null;
		FileOutputStream fos= null;
		DataOutputStream dos = null;
		file2= new File("input.txt");
		fos = new FileOutputStream(file2);
		dos = new DataOutputStream(fos);
		dos.writeInt(10);
		dos.writeShort(20);
		dos.writeLong(40L);
		dos.writeFloat(34.05f);
		dos.writeDouble(34.54);
		
		//1.파일을 읽어오기.(기본자료형을 가지고 읽어오기)
		File file = null;
		FileInputStream fis = null;
		DataInputStream dis = null;
		file = new File("input.txt");
		fis= new FileInputStream(file);
		dis= new DataInputStream(fis);
		System.out.println(dis.readInt());
		System.out.println(dis.readShort());
		System.out.println(dis.readLong());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		
		if(dis !=null) {
			dis.close();
		}
	}


}
