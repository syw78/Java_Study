package chapter16.thread;

import java.awt.Toolkit;

// ������ 1�����. Thread�κ��� ��ӹ޴´�.
public class MyThread2 extends Thread {

	// 2. Thread�� �����Ѵ�.

	@Override
	public void run() {
		//2. �Ҹ��� �۵���Ű�� ���
		System.out.println("t2="+Thread.currentThread().getName());
		Toolkit tool=Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			tool.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}

	}

