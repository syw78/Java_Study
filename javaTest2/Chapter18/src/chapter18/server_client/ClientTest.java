package chapter18.server_client;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientTest extends JFrame implements ActionListener {
	private Socket socket;
	private BufferedReader bufferedReader;
	private PrintWriter printWriter;
	private JTextArea area;
	private JTextField feild;

	public ClientTest() {
		setTitle("xim");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		feild = new JTextField(50);
		feild.addActionListener(this);
		area = new JTextArea(10, 50);
		
		area.setEditable(true);
		add(feild, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);

		try {
			socket = new Socket("192.168.112.8", 9111);
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);

			area.append(bufferedReader.readLine() + "\n");//1
			area.append(bufferedReader.readLine() + "\n");//2

		} catch (IOException e) {
			System.out.println("socket connecting error");
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		printWriter.println(feild.getText());
		String data = null;
		try {
			data = bufferedReader.readLine();
			area.append(data + "\n");
			data = bufferedReader.readLine();
			area.append(data + "\n");
		} catch (IOException e1) {
			System.out.println("read error");
		}
		
	}

	public static void main(String[] args) {
		ClientTest c = new ClientTest();
	}

}

	   