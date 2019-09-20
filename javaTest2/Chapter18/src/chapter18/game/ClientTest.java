package chapter18.game;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClientTest extends Thread {
	private JButton[][] button = new JButton[3][3];
	private char me, other;
	private JFrame frame;
	private JPanel panel;
	private JLabel messege;
	private Socket socket;
	private BufferedReader br;
	private PrintWriter pw;

	public ClientTest() {
		try {
			socket = new Socket("192.168.0.213", 9001);  //내 컴퓨터 주소 적어라!
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(),true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		frame = new JFrame();
		panel = new JPanel();
		panel.setLayout(new GridLayout(3, 3, 5, 5));
		Font font = new Font("Dialog", Font.ITALIC, 50);
		messege = new JLabel("여기에 메세지 출력");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel, BorderLayout.CENTER);
		frame.add(messege, BorderLayout.SOUTH);
		frame.setSize(300, 300);
		frame.setVisible(true);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				final int ii = i;
				final int jj = j;
				button[i][j] = new JButton(" ");
				button[i][j].setFont(font);
				button[i][j].addActionListener(e -> {
					button[ii][jj].setText("" + me);
					pw.println("MOVE " + ii + " " + jj);
				});
				panel.add(button[i][j]);
			} // end inner for
		} // end outter for
		panel.repaint(); // 무효화 영역처리방식!

	}// end of 생성자

	@Override
	public void run() {
		String data = null;
		try {
			data = br.readLine();
			if (data.startsWith("START")) {
				me = data.charAt(6);
				other = (me == 'X') ? ('O') : ('X');
				messege.setText("경기가 시작됩니다.");
				frame.setTitle("현재경기자는" + me);
			}

		
			while (true) {
				data = br.readLine();
				if(data.startsWith("OTHER")) {
					int i=Integer.parseInt(data.substring(6, 7));
					int j=Integer.parseInt(data.substring(8, 9));
					button[i][j].setText(""+other);
					messege.setText("상대방이 두었습니다.");
					
				}else if(data.startsWith("PRINT")) {
					messege.setText(data.substring(6));
				}
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}//end of while
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				pw.close();
				br.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}//end of finally
		

	}

	public static void main(String[] args) {
		ClientTest ct =new ClientTest();
		ct.start();
	}

}
