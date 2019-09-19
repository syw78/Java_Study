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
//      ���� ������ �����/
		// �����ͺ��̽� Ȱ��
		map.put("�ڹ�", "JAVA");
		map.put("��ǻ��", "Computer");
		map.put("�ڵ�", "handle");
		map.put("����", "file");
		map.put("���̽�ũ��", "icecream");
		ServerSocket ss = null;
		System.out.println("����");
		try {
			while (true) {

				ss = new ServerSocket(2700);
				Socket socket = ss.accept();// ������ ����� �ۼ�Ʈ��
				Translator tl = new Translator(socket);
				tl.start();
			}
		} catch (IOException e) {

		} finally {
			try {
				System.out.println("��������");
				ss.close();
			} catch (IOException e) {
			}
		}
	}

//   ����Ŭ������ �����.
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

// 1�� ������ (�޼����ּҹ�ȣ)
		@Override
		public void run() {
			pw.println(socket.getLocalPort() + "�ݰ����ϴ�." + (socket.getInetAddress().getHostAddress()));
			try {// 2. 5. 8.������ (�޼���)
				while (true) {
					pw.println("�ܾ��Է��Ͻÿ�");
//               3. 6. 9.�д´�(�ܾ�)
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
				System.out.println("�дµ� �����Դϴ�.");
			} finally {
				try {
					socket.close();
					br.close();
					pw.close();
				} catch (IOException e) {
					System.out.println("�ݴµ� �����Դϴ�.");
				}
			} // end of try
		}// end of run
	}
}