package chapter18.server_socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerSocketTest {

	public static void main(String[] args) throws IOException {
		ServerSocket ss =new ServerSocket(9100);
		while(true) {
			//������ Ŭ���̾�Ʈ�� �����ؿ��⸦ ��ٸ����ִ� ����.
			//���� �����ؿ��� Ŭ���̾�Ʈ ������ �����.
			System.out.println("Ŭ���̾�Ʈ ���� ��ٸ�����");
			Socket socket =ss.accept(); //������ 						������������ ������ �ּҸ� �� �� �ִ�.
			
			OutputStream os=socket.getOutputStream();
			InputStream is = socket.getInputStream();
			InputStreamReader isr= new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String data = br.readLine();
			
			PrintStream ps = new PrintStream(os);
			ps.println(new Date().toString());
			ps.close();
			break;
		}//end of while
		ss.close();
	}

}
