package chapter17.copyline2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyLineTest {

	public static void main(String[] args) throws IOException {
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
		BufferedWriter bufferedWriter=null;
		
		// =====�����͸� �о���� ��ɰ�ü����
		File file1=new File("input.txt");
		fileReader = new FileReader("input.txt");
		bufferedReader = new BufferedReader(fileReader);
		// ===== �����͸� �����ϴ� ��ɰ�ü����
		File file2=new File("output.txt");
		fileWriter = new FileWriter(file2);
		bufferedWriter=new BufferedWriter(fileWriter);
		printWriter = new PrintWriter(bufferedWriter);

		String data = null;

		while ((data = bufferedReader.readLine()) != null) {
			printWriter.println(data);
		}
		if (bufferedReader != null) {
			bufferedReader.close();
		}
		if (printWriter != null) {
			printWriter.close();
		}
	}

}
