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
		//�������� ��������.
		//1.File file = new File("index.html")�̶� �Ȱ����� �Ѵ� �׷��� url���ؼ� ã�´�.
			URL url=new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRr1tME8261hE_HLXifLSQmEQionJlud0c2aNGExahS1RlM3PeRbg");
			URLConnection urlCon = url.openConnection();
			InputStream is = urlCon.getInputStream();
			//InputStream is = url.openStream(); //�̰������� �ؿ� 2�� ���� �ʿ� ����.
			BufferedInputStream bis = new BufferedInputStream(is);
			
			//�����ϱ� ��������
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
			System.out.println("�̹����� �������� ����ǻ�ͷ� ���� �Ϸ�.");
		}	
	
	}


