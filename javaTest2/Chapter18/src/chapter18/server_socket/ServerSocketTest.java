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
			//무조건 클라이언트가 접속해오기를 기다리고있는 상태.
			//만약 접속해오면 클라이언트 소켓을 만든다.
			System.out.println("클라이언트 접속 기다리는중");
			Socket socket =ss.accept(); //대기상태 						소켓을가지고 상대방의 주소를 알 수 있다.
			
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
