package chapter09.event;

import java.awt.event.ActionListener;

import javax.swing.Timer;


public class ClassTest {

	public static void main(String[] args) throws InterruptedException{ 
		ActionListener actionListener = new MyClass();
		//1.시간타이머로 이벤트를 자동 발생 시켜보자.
		Timer t= new Timer(1000, actionListener);
		t.start();
		for(int i=0;i<10;i++) {
			Thread.sleep(1000);
		}
	}

}
