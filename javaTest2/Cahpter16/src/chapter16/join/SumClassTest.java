package chapter16.join;

public class SumClassTest {

	public static void main(String[] args) throws InterruptedException {
		//1. ������ü�� �����.
		Data data=new Data();
		System.out.println("1~100�հ�="+data.getSum());
		//2. ������ ��ü�� �����.
		Thread thread = new SumClass(data);
		thread.start();
		System.out.println("��ٷ��ּ���......");
		thread.join(); // SumClass �����尡 ������ main �����尡 �۵��ȴ�
		System.out.println("1~100�հ�="+data.getSum());
		
	}

}
