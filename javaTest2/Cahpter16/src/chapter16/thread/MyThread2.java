package chapter16.thread;

import java.awt.Toolkit;

// 스레드 1번방식. Thread로부터 상속받는다.
public class MyThread2 extends Thread {

	// 2. Thread를 구현한다.

	@Override
	public void run() {
		//2. 소리를 작동시키는 방법
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

