package chapter16.bbaker;

public class Bakery {
	private static int num;
	private String[] bread = {"�Һ��� ��", "ũ����", "���ϻ�", "��ũ����", "�Ļ�", "µ", "�ο�ű"};
	private boolean isBread = false;
	
	public synchronized String getBread() {
		
		while(!isBread) {
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(num == 5 || num == 6) {
			System.out.println(this.bread[num] + "�� �¾ҽ��ϴ�.");
		} else {
			System.out.println(this.bread[num] +"�� �Ծ����ϴ�.");
		}
		isBread = false;
		notifyAll();
		
		return this.bread[num];
	}
	
	public synchronized void setBread() {

		while(isBread) {
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		num = (int)(Math.random()*7);
		
		if(num == 6 || num == 7) {
			System.out.println(this.bread[num] + "�� ���Ƚ��ϴ�.");
		} else {
			System.out.println(this.bread[num] + "�� ��������ϴ�. ");
		}
		
		isBread = true;
		
		notifyAll();
	}

}
