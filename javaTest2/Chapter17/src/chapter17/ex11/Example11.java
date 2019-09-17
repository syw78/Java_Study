package chapter17.ex11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example11 {

	public static void main(String[] args) throws IOException {
		boolean compare = false;
		
		File file1 = new File("input.txt");
		File file2 = new File("input3.txt");
		FileInputStream fi1 = new FileInputStream(file1);
		FileInputStream fi2 = new FileInputStream(file2);
		while(true) {
			int data = fi1.read();
			int data2= fi2.read();
			if(data ==-1&&data2==-1) {
				compare = true;
				break;
			}else if(data==-1||data2==-1) {
				compare = false;
				break;
			}
			if(data!=data2) {
				compare = false;
				break;
			}
		}//end while
		if(compare) {
			System.out.println("�ΰ��� ������ �����ϴ�.");
		}else {
			System.out.println("�ΰ��� ������ �ٸ��ϴ�.");
		}
	}

}
