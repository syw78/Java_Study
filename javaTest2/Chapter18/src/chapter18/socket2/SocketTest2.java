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
		//1. 포트번호를 개방한다
				ServerSocket ss=new ServerSocket(9001);
				
				//2. 무한루프를돌린다.
				while(true) {
					Socket socket=ss.accept();
					list.add(socket);
					Transport tp=new Transport(socket);
					tp.start();
					//3. 객체를 만들어서 socket 전달한다.
					//4. 객체를 스레드 run() 실행한다.
				}
				//5. 서버소켓을 닫는다. 
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
					//1. 소켓으로부터 inputStream outputStream 얻어온다.
					try {
						is=socket.getInputStream();
						OutputStream os= socket.getOutputStream();
					} catch (IOException e) {}
					while(true) {
						//서로약소된 방식으로 주고 받으면 된다. 
						
					}
					
				}
			}//end of Transport
	}


