package chapter18.clienttest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ServerTest {
	private static HashMap<String, String> map = new HashMap<String, String>();

	public static void main(String[] args) {
//      서버 소켓을 만든다/
		// 데이터베이스 활용
		map.put("자바", "JAVA");
		map.put("컴퓨터", "Computer");
		map.put("핸들", "handle");
		map.put("파일", "file");
		map.put("아이스크림", "icecream");
		ServerSocket ss = null;
		System.out.println("시작");
		try {
			while (true) {

				ss = new ServerSocket(2700);
				Socket socket = ss.accept();// 소켓을 만든다 앱셋트로
				Translator tl = new Translator(socket);
				tl.start();
			}
		} catch (IOException e) {

		} finally {
			try {
				System.out.println("서버시작");
				ss.close();
			} catch (IOException e) {
			}
		}
	}

//   내부클래스를 만든다.
	public static class Translator extends Thread {
		private Socket socket;
		private BufferedReader br;
		private PrintWriter pw;

		public Translator(Socket socket) throws IOException {
			super();
			this.socket = socket;
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(), true);
		}

// 1번 보낸다 (메세지주소번호)
		@Override
		public void run() {
			pw.println(socket.getLocalPort() + "반갑습니다." + (socket.getInetAddress().getHostAddress()));
			try {// 2. 5. 8.보낸다 (메세지)
				while (true) {
					pw.println("단어입력하시오");
//               3. 6. 9.읽는다(단어)
					String data = br.readLine();
					if (data == null) {
						break;
					}
					Set<Entry<String, String>> set = map.entrySet();
					boolean find = false;
					for (Entry<String, String> entry : set) {
						String key = entry.getKey();
						if (key.equals(data)) {
							find = true;
							pw.println(data + "=" + entry.getValue());
						}

					} // end for
				}
			} catch (IOException e) {
				System.out.println("읽는데 오류입니다.");
			} finally {
				try {
					socket.close();
					br.close();
					pw.close();
				} catch (IOException e) {
					System.out.println("닫는데 오류입니다.");
				}
			} // end of try
		}// end of run
	}
}