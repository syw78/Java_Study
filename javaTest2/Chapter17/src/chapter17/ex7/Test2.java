package chapter17.ex7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test2 {

	public static void main(String[] args) throws IOException {
		ArrayList<Integer> al = new ArrayList<Integer>();
		File file = new File("input.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br= new BufferedReader(fr);
		
		String data;
		
		while((data=br.readLine())!=null) {
			//System.out.println(data);
			al.add(Integer.parseInt(data));
		}//end while
		Collections.sort(al);
		
		//출력선택 로직 클래스선정
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		Iterator<Integer> iterator =al.iterator();
		while(iterator.hasNext()) {
			pw.println(iterator.next());
		}
		if(br != null) {br.close();}
		if(pw != null) {pw.close();}
		System.out.println("잘 되었습니다.");
	}

}
