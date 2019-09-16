package chapter17.ex7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) throws IOException  {
		//파일을 읽어온다.
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		File file = null;
		FileReader fr = null;
		BufferedReader br= null;
		
		file = new File("input.txt");
		fr = new FileReader(file);
		br= new BufferedReader(fr);
		
		String data = null;
		while((data=br.readLine())!=null) {
			al.add(Integer.parseInt(data));
			//문자열을 숫자로 바꾸기.
		}
		Iterator<Integer> iter =al.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("============");
		
		Collections.sort(al);
		//Collections.reverse(al);
		for(Integer i :al) {
			System.out.println(i);
		}
		//파일에 저장하는 기능구현
		File file2 = null; 
		FileOutputStream fos = null;
		PrintWriter pw = null;
		file2 = new File("output.txt");
		fos = new FileOutputStream(file2);
		pw = new PrintWriter(fos); //print ,println  보강한 클래스
		
		for(Integer ig :al) {
			pw.print(ig);
			pw.println(ig);
		}
		
		if(br!=null) {
			br.close();
		}
		if(pw !=null) {
			pw.close();
		}
	}
}
