package chapter16.thread;

import java.awt.Toolkit;

public class MyThread3 implements Runnable {

	@Override
	public void run() {
		Toolkit tool=Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			tool.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
		}
			
		}

}
}