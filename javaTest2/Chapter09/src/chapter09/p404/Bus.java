package chapter09.p404;

public class Bus implements Operator {
	public void start() {
		System.out.println("������ ����մϴ�.");
	}
	public void stop() {
		System.out.println("������ �����մϴ�.");
	}
	public void setSpeed(int speed) {
		System.out.println("������ �ӵ���"+speed+"km/h�� �ٲߴϴ�");
	}
	public void turn(int degree) {
		System.out.println("������ ������ "+degree+"�� ��ŭ �ٲߴϴ�.");
	}
	
}
