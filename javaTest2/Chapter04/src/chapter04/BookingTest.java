package chapter04;

import java.util.Arrays;
import java.util.Scanner;

public class BookingTest {
	//public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 1. 객체를 선언한다.
		Book book = new Book(0); //1번 객체배열선언과 2번 초기화 완료
		
		/*
		 * // 1 배열선언 10 final int COUNT = 10; int[] seat = new int[COUNT];
		 * 
		 * 
		 * // 2 배열을 사용자로부터 입력받아서 초기화 한다. inputArrayValue(seat);
		 */

		// 3 출력한다.
		//seatPrint(seat);
		book.seatPrint();
		// 4 좌석번호 예약을 받는다.
		for(;;) {
			
			//int index=inputBookIndex();
			book.inputBookIndex();
			//5.좌석번호가 예약되어있는지 점검한다.
			int[] seat=book.getSeat();
			if(seat[book.getIndex()-1]==1)//seat[index-1]==1
			{
				System.out.println("이미 예약되었습니다. 다시입력바랍니다.");
				continue;
			}else {
				seat[book.getIndex()-1]=1;    //seat[index-1] =1;
				System.out.println("예약이 완료되었습니다");
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

		System.out.print("배열 초기값을 설정 요망");
		//int initValue = scan.nextInt();
		for (int i = 0; i < seat.length; i++) {
			//seat[i] = initValue;
		}
	}

	public static int inputBookIndex() {
		int index=0;
		for (;;) {
			System.out.print("좌석번호(1~10)를 입력하세요 (종료는 -1)");
			//index = scan.nextInt();
			if (index == -1) {
				System.out.println("안녕히가세요");
				System.exit(0);
			}
			if (index >= 1 && index <= 10) {
				break;
			}
			System.out.println("정신차리세요");
		}
		return index;
	}
}

