package chapter16.jframe;

import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDownTest extends JFrame {
	// 멤버변수
	private JLabel label;

	// 멤버내부인스턴스클래스
	private class MyThread extends Thread {
		public void run() {
			// 반복문 실행 1~10까지 라벨객체 출력 화면객체에다 출력
			for (int i = 1; i < 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
				label.setText(String.valueOf(i));
			} // end of for
		}// end of run
	}// end of inner class

	// 생성자 함수
	public CountDownTest() throws HeadlessException {
		super();

		setTitle("홍길동"); // 윈도우창 이름 창이름을 셋팅한다.
		//this.label = label;
		setSize(300, 200); // 윈도우창 크기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우창 닫기 기능부여
		this.label = new JLabel("스타트");// 라벨객체를 만든다.
		this.label.setFont(new Font("Serif", Font.BOLD, 50));
		add(label); // 윈도우창에 라벨 컴포넌트 배치한다.
		Thread thread = new MyThread();
		thread.start();
		setVisible(true);// 윈도우창을 보여지도록 활성화

	}

}
