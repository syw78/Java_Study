package chapter17.ex9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		File file = new File("test.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		
		
		File file2 = new File("testout.txt");
		FileWriter fw = new FileWriter(file2);
		BufferedWriter bw = new BufferedWriter(fw);
		
		int i=0;
		String data=null;
		while((data=br.readLine())!=null) {
			bw.write((++i)+" "+data+"\n");
		}
		System.out.println("¿Ï·á");
		bw.flush();
		br.close();
		bw.close();
	}

}
