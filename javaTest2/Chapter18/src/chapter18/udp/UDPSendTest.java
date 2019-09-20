package chapter18.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPSendTest {

	public static void main(String[] args) {
		//1.데이타그램 소켓을 만든다.
		DatagramSocket dSocket=null;
		InetAddress ia=null;
		try {
			 dSocket = new DatagramSocket(6000);
		} catch (SocketException e) {
			e.printStackTrace();
		}
		//2.보낼 데이타를  바이트배열로 만들어 놓는다.
		String data = new String("내 인생은 내가 개척한다! 힘을내요 슈퍼파월");
		byte[] buf = data.getBytes();
		
		//3. 보내고자하는 주소를 설정한다.
		try {
			ia=InetAddress.getByName("192.168.0.213");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		//4.패킷을 만든다.
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
