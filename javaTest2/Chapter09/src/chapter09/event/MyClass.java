package chapter09.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyClass implements ActionListener {
	private int count=0;
	
	//이벤트가 발생되면 불러지는 콜백 함수다.
	//매개변수는 이벤트가 발생이되면 발생이될때 모든 정보를 객체로 만들어서
	//ActionEvent event(변수)= 객체
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//이벤트가 발생 되었을때 해야될 일 적으면 된다.
		System.out.println((count++)+"beep");
		
	}

}
