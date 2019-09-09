package chapter16.thread;

// 스레드 1번방식. Thread로부터 상속받는다.
public class MyThread extends Thread {

	// 2. Thread를 구현한다.

	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}

	}
}
