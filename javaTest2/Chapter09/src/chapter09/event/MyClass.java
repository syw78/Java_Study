package chapter09.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyClass implements ActionListener {
	private int count=0;
	
	//�̺�Ʈ�� �߻��Ǹ� �ҷ����� �ݹ� �Լ���.
	//�Ű������� �̺�Ʈ�� �߻��̵Ǹ� �߻��̵ɶ� ��� ������ ��ü�� ����
	//ActionEvent event(����)= ��ü
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//�̺�Ʈ�� �߻� �Ǿ����� �ؾߵ� �� ������ �ȴ�.
		System.out.println((count++)+"beep");
		
	}

}
