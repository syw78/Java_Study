package chapter18.server_client;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ServerTest {
	private static Map<String, String> map = new HashMap<String, String>();
	public static void main(String[] args) throws Exception{
		map.put("자바", "JAVA");
		map.put("컴퓨터", "computer");
		map.put("핸드폰", "handle");
		map.put("파일", "file");
		map.put("아이스크림", "icecream");
		
		System.out.println("Run Server");
		int clientId = 0;
		ServerSocket serverSocket = new ServerSocket(2562);
		try {
			
			while(true) {
				clientId++;
				Translator t = new Translator(serverSocket.accept(), clientId);
				t.start();
			}	
		}finally {	
			serverSocket.close();	
		}
	}
	public static class Translator extends Thread {
		private Socket socket;
		private int myId;
		private BufferedReader bufferedReader;
		private PrintWriter printWriter;
		
		public Translator(Socket socket, int myId) throws IOException {
			this.socket = socket;
			this.myId = myId;
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			printWriter = new PrintWriter(socket.getOutputStream(),true);
		}
		@Override
		public void run() {
			printWriter.println("HI Client number : " + socket.getInetAddress());//1
			try {
				while(true) {
					
					printWriter.println("input word :");//2
					
					String inputWord = bufferedReader.readLine();//01
					System.out.println(inputWord);
					
					if(inputWord == null) {
						break;
					}
					Set<Entry<String, String>> set=map.entrySet();
					boolean find = false;
					for(Entry<String, String> entry : set) {
						String key = entry.getKey();
						if(key.equals(inputWord)) {
							find = true;
							printWriter.println(inputWord + " "+ entry.getValue());
	
						}
						if(!find) {
							printWriter.println("정신차려");
						}
					}
					
					if(inputWord.equals("java")) {
						printWriter.println("java -> 자바");//3
						
					} else {
						printWriter.println("Not Found Word");//3
					}
				}
				
			} catch (IOException e) {
				System.out.println("Error … Client : " + myId);
				e.printStackTrace();
			}finally {
				try {
					socket.close();
					bufferedReader.close();
					printWriter.close();
				} catch (IOException e) {
					System.out.println("socket close Error");
					e.printStackTrace();
				}
				
				System.out.println("END !!!! Client : " + myId);
			}
		}
		
	}
}
