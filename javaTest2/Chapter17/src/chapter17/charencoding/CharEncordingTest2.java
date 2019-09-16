package chapter17.charencoding;
import java.io.*;

public class CharEncordingTest2 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fileInputStream = new FileInputStream("Input.txt");
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		
		FileOutputStream fileOutputStream = new FileOutputStream("Output7.txt");
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
		
		String data = null;
		
		
		while((data = bufferedReader.readLine()) != null) {
			System.out.println(data);
			byte[] dataByte = data.getBytes();
			bufferedOutputStream.write(dataByte);
		}
		
		System.out.println("�����߽��ϴ�.");
		if(bufferedReader != null) {
			bufferedReader.close();
		}
		if(bufferedOutputStream != null) {
			bufferedOutputStream.close();
		}
	}

}

