package chapter18.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPSendTest {

	public static void main(String[] args) {
		//1.����Ÿ�׷� ������ �����.
		DatagramSocket dSocket=null;
		InetAddress ia=null;
		try {
			 dSocket = new DatagramSocket(6000);
		} catch (SocketException e) {
			e.printStackTrace();
		}
		//2.���� ����Ÿ��  ����Ʈ�迭�� ����� ���´�.
		String data = new String("�� �λ��� ���� ��ô�Ѵ�! �������� �����Ŀ�");
		byte[] buf = data.getBytes();
		
		//3. ���������ϴ� �ּҸ� �����Ѵ�.
		try {
			ia=InetAddress.getByName("192.168.0.213");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		//4.��Ŷ�� �����.
		DatagramPacket dp =new DatagramPacket(buf, buf.length,ia,5000);
		try {
			dSocket.send(dp);
			System.out.println(new String(buf));
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			dSocket.close();
		}
		
	}

}
