package chapter09.p404;

public class Car implements Operator {
	public void start() {
		System.out.println("�ڵ����� ����մϴ�.");
	}
	public void stop() {
		System.out.println("�ڵ����� �����մϴ�.");
	}
	public void setSpeed(int speed) {
		System.out.println("�ڵ����� �ӵ���"+speed+"km/h�� �ٲߴϴ�");
	}
	public void turn(int degree) {
		System.out.println("�ڵ����� ������ "+degree+"�� ��ŭ �ٲߴϴ�.");
	}
	
}
