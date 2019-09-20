package chapter18.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiveTest {

	public static void main(String[] args) {
		// 1. ����Ÿ�׷������� �����.
				DatagramSocket dSocket = null;
				try {
					dSocket = new DatagramSocket(5000);
				} catch (SocketException e) {
					e.printStackTrace();
				}
				// 2 ��������Ÿ�� ����Ʈ�迭�� ����� ���´�.
				byte[] buf = new byte[1024];
			
				// 4. ��Ŷ�� �����.
				DatagramPacket dp = new DatagramPacket(buf, buf.length);
				try {
					dSocket.receive(dp);
					System.out.println(new String(buf));
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					dSocket.close();
				}

			}

	}


