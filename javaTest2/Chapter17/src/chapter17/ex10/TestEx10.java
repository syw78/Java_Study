package chapter17.ex10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestEx10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("ex10.txt"));
		BufferedReader br2=new BufferedReader(new FileReader("ex10_2.txt"));
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("ex10_total"));
		
		String data1 = null;
		String data2 = null;
		while((data1=br.readLine())!=null) {
			bw.write(data1+"\n");
		}
		while((data2=br2.readLine())!=null) {
			bw.write(data2+"\n");
		}
		br.close(); br2.close();
		bw.flush(); bw.close();
		
	}

}
