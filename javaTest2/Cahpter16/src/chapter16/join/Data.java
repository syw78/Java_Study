package chapter16.join;
											//���� Ŭ���� ���� ��ü.
public class Data {
	private int sum=0;

	
	//����ȭ ó��
	public synchronized int getSum() {
		return sum;
	}
	//����ȭ ó��  2�������尡 �Ѱ��� ������ü�� �ϱ����� ��ũ�γ���� ����.
 	public synchronized void setSum(int sum) {
		this.sum = sum;
	}
	
	
}
