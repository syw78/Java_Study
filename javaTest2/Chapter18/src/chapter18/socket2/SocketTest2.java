package chapter18.socket2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class SocketTest2 {
	private static ArrayList<Socket> list=new ArrayList<Socket>();

	public static void main(String[] args) throws IOException {
		//1. ��Ʈ��ȣ�� �����Ѵ�
				ServerSocket ss=new ServerSocket(9001);
				
				//2. ���ѷ�����������.
				while(true) {
					Socket socket=ss.accept();
					list.add(socket);
					Transport tp=new Transport(socket);
					tp.start();
					//3. ��ü�� ���� socket �����Ѵ�.
					//4. ��ü�� ������ run() �����Ѵ�.
				}
				//5. ���������� �ݴ´�. 
			}//end of main
			
			private static class Transport extends Thread{
				private Socket socket;
				private InputStream is; 

				public Transport(Socket socket) {
					super();
					this.socket = socket;
				}

				@Override
				public void run() {
					//1. �������κ��� inputStream outputStream ���´�.
					try {
						is=socket.getInputStream();
						OutputStream os= socket.getOutputStream();
					} catch (IOException e) {}
					while(true) {
						//���ξ�ҵ� ������� �ְ� ������ �ȴ�. 
						
					}
					
				}
			}//end of Transport
	}


