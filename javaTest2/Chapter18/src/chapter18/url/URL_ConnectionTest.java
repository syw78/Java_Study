package chapter18.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URL_ConnectionTest {

	public static void main(String[] args) throws IOException {
		//1.File file = new File("index.html")이랑 똑같은걸 한다 그래서 url통해서 찾는다.
		URL url=new URL("http://www.google.com:80/index.html");
		//2.FileInputStream fs = new FileInputStream(); 처럼한다.
		InputStream is = url.openStream(); //이게있으면 밑에 2개 문장 필요 없다.
		//URLConnection urlCom=url.openConnection();                                            //Connection = 연결 연결하다.
		//InputStream is =urlCom.getInputStream();
		//3.InputStreamReader isr = new InputStreamReader(fs) 처럼 한다.
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
