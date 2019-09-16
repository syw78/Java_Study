package chapter17.copyline;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopyLineTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fi = null;
		FileWriter fo=null;
		InputStreamReader isr = null;
		
		fi=new FileInputStream("input.txt"); //1바티으로 읽어서
		isr = new InputStreamReader(fi);
		fo= new FileWriter("output3.txt"); //2바이트로 저장
		
		int data;
		
		while((data=isr.read())!=-1) {
			fo.write(data);
		}
		System.out.println("복사완료했습니다.");
		if(fi !=null) {
			fi.close();
		}
		if(fo !=null) {
			fo.close();
		}
		
	}

}
