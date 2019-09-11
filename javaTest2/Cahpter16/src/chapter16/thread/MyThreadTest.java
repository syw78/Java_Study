package chapter16.thread;

import java.awt.Toolkit;

public class MyThreadTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		//1. ���ڸ� ����ִ� ������		
		//2. �Ҹ��� �۵���Ű�� ������
		//Thread mt= new MyThread();
		Thread mt = new Thread() {
			@Override
			public void run() {
				System.out.println("t1="+Thread.currentThread().getName());
				for (int i = 1; i < 5; i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {

					}
				}
			}
		};
		Thread mt2= new MyThread2();
		mt.start();
		mt2.start();
		//mt.run(); �� ��ŸƮ �Ѵ� ���ư�.
	}
}
