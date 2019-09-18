package chapter18.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URL_ConnectionTest {

	public static void main(String[] args) throws IOException {
		//1.File file = new File("index.html")�̶� �Ȱ����� �Ѵ� �׷��� url���ؼ� ã�´�.
		URL url=new URL("http://www.google.com:80/index.html");
		//2.FileInputStream fs = new FileInputStream(); ó���Ѵ�.
		InputStream is = url.openStream(); //�̰������� �ؿ� 2�� ���� �ʿ� ����.
		//URLConnection urlCom=url.openConnection();                                            //Connection = ���� �����ϴ�.
		//InputStream is =urlCom.getInputStream();
		//3.InputStreamReader isr = new InputStreamReader(fs) ó�� �Ѵ�.
		InputStreamReader isr = new InputStreamReader(is);
		//4. BufferedReader br = new BufferedReader(isr);
		BufferedReader br = new BufferedReader(isr);
		String data=null;
		while((data=br.readLine())!=null) {
			System.out.println(data);
		}
		if(br !=null) {
			br.close();
		}
	}

}
