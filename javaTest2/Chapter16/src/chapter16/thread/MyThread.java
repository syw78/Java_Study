package chapter16.thread;

// ������ 1�����. Thread�κ��� ��ӹ޴´�.
public class MyThread extends Thread {

	// 2. Thread�� �����Ѵ�.

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
