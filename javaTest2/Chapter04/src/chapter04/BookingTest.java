package chapter04;

import java.util.Arrays;
import java.util.Scanner;

public class BookingTest {
	//public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 1. ��ü�� �����Ѵ�.
		Book book = new Book(0); //1�� ��ü�迭����� 2�� �ʱ�ȭ �Ϸ�
		
		/*
		 * // 1 �迭���� 10 final int COUNT = 10; int[] seat = new int[COUNT];
		 * 
		 * 
		 * // 2 �迭�� ����ڷκ��� �Է¹޾Ƽ� �ʱ�ȭ �Ѵ�. inputArrayValue(seat);
		 */

		// 3 ����Ѵ�.
		//seatPrint(seat);
		book.seatPrint();
		// 4 �¼���ȣ ������ �޴´�.
		for(;;) {
			
			//int index=inputBookIndex();
			book.inputBookIndex();
			//5.�¼���ȣ�� ����Ǿ��ִ��� �����Ѵ�.
			int[] seat=book.getSeat();
			if(seat[book.getIndex()-1]==1)//seat[index-1]==1
			{
				System.out.println("�̹� ����Ǿ����ϴ�. �ٽ��Է¹ٶ��ϴ�.");
				continue;
			}else {
				seat[book.getIndex()-1]=1;    //seat[index-1] =1;
				System.out.println("������ �Ϸ�Ǿ����ϴ�");
				book.seatPrint(); //seatPrint(seat);
			}
		}
	}
	public static void seatPrint(int [] seat) {
		int [] number = new int[] {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(seat));
		return;
	}
	public static void inputArrayValue(int[] seat) {

		System.out.print("�迭 �ʱⰪ�� ���� ���");
		//int initValue = scan.nextInt();
		for (int i = 0; i < seat.length; i++) {
			//seat[i] = initValue;
		}
	}

	public static int inputBookIndex() {
		int index=0;
		for (;;) {
			System.out.print("�¼���ȣ(1~10)�� �Է��ϼ��� (����� -1)");
			//index = scan.nextInt();
			if (index == -1) {
				System.out.println("�ȳ���������");
				System.exit(0);
			}
			if (index >= 1 && index <= 10) {
				break;
			}
			System.out.println("������������");
		}
		return index;
	}
}

