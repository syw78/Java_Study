package chapter16.jframe;

import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDownTest extends JFrame {
	// �������
	private JLabel label;

	// ��������ν��Ͻ�Ŭ����
	private class MyThread extends Thread {
		public void run() {
			// �ݺ��� ���� 1~10���� �󺧰�ü ��� ȭ�鰴ü���� ���
			for (int i = 1; i < 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
				label.setText(String.valueOf(i));
			} // end of for
		}// end of run
	}// end of inner class

	// ������ �Լ�
	public CountDownTest() throws HeadlessException {
		super();

		setTitle("ȫ�浿"); // ������â �̸� â�̸��� �����Ѵ�.
		//this.label = label;
		setSize(300, 200); // ������â ũ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������â �ݱ� ��ɺο�
		this.label = new JLabel("��ŸƮ");// �󺧰�ü�� �����.
		this.label.setFont(new Font("Serif", Font.BOLD, 50));
		add(label); // ������â�� �� ������Ʈ ��ġ�Ѵ�.
		Thread thread = new MyThread();
		thread.start();
		setVisible(true);// ������â�� ���������� Ȱ��ȭ

	}

}
