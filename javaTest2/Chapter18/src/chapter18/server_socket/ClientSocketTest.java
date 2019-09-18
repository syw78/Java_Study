package chapter18.server_socket;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocketTest {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket socket = new Socket("192.168.0.230", 9100);
		InputStream is = socket.getInputStream();
		OutputStream os =socket.getOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(os);
		PrintStream ps = new PrintStream(bos);
		ps.println("������ ���� Ư���� ����������� ��Ź�帳�ϴ�."); //�ٷ�����
		ps.flush();
		
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("�����κ��� �亯�� ��ٸ��� �ֽ��ϴ�.");
		String data = br.readLine();
		System.out.println(data);
		br.close();
		
	}

}
