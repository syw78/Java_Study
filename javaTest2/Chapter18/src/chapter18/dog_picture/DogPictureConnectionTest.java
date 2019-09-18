package chapter18.dog_picture;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class DogPictureConnectionTest {

	public static void main(String[] args) throws IOException {
		//가져오기 로직순서.
		//1.File file = new File("index.html")이랑 똑같은걸 한다 그래서 url통해서 찾는다.
			URL url=new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRr1tME8261hE_HLXifLSQmEQionJlud0c2aNGExahS1RlM3PeRbg");
			URLConnection urlCon = url.openConnection();
			InputStream is = urlCon.getInputStream();
			//InputStream is = url.openStream(); //이게있으면 밑에 2개 문장 필요 없다.
			BufferedInputStream bis = new BufferedInputStream(is);
			
			//저장하기 로지순서
			File file = new File("dogs.jpg");
			FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			
			byte[] buffer = new byte[1024];
			int size = 0;
			while((size=bis.read(buffer))!=-1) {
				bos.write(buffer, 0, size);
			}
			bis.close();
			bos.close();
			System.out.println("이미지가 서버에서 내컴퓨터로 복사 완료.");
		}	
	
	}


