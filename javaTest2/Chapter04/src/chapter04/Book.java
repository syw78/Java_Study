package chapter04;

import java.util.Arrays;
import java.util.Scanner;

public class Book {
	// 1. �������(����������� , �ν��Ͻ� �������)
	private static Scanner scan = new Scanner(System.in); //�����������
	private static final int COUNT = 10; //�����������
	private int[] seat = new int[COUNT]; //�ν��Ͻ��������
	private int index;
	
	// 2. �������Լ�
		public Book(int init) {
			index=0;
			for (int i = 0; i < seat.length; i++) {
				seat[i] = init;
			}
		}


	
	
	public int[] getSeat() {
			return seat;
		}




		public void setSeat(int[] seat) {
			this.seat = seat;
		}




		public int getIndex() {
			return index;
		}




		public void setIndex(int index) {
			this.index = index;
		}




	// 3. ����Լ�
	public void inputArrayValue() {

		System.out.print("�迭 �ʱⰪ�� ���� ���");
		int initValue = scan.nextInt();
		for (int i = 0; i <seat.length ; i++) {
			seat[i] = initValue;
		}
	}
	public  void seatPrint() {
		int [] number = new int[] {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(seat));
		return;
	}
	public void inputBookIndex() {
		for (;;) {
			System.out.print("�¼���ȣ(1~10)�� �Է��ϼ��� (����� -1)");
			index = scan.nextInt();
			if (index == -1) {
				System.out.println("�ȳ���������");
				System.exit(0);
			}
			if (index >= 1 && index <= 10) {
				break;
			}
			System.out.println("������������");
		}
	}
	
	
	

}
