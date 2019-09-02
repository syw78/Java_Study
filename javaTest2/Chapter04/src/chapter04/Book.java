package chapter04;

import java.util.Arrays;
import java.util.Scanner;

public class Book {
	// 1. 멤버변수(정적멤버변수 , 인스턴스 멤버변수)
	private static Scanner scan = new Scanner(System.in); //정적멤버변수
	private static final int COUNT = 10; //정적멤버변수
	private int[] seat = new int[COUNT]; //인스턴스멤버변수
	private int index;
	
	// 2. 생성자함수
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




	// 3. 멤버함수
	public void inputArrayValue() {

		System.out.print("배열 초기값을 설정 요망");
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
			System.out.print("좌석번호(1~10)를 입력하세요 (종료는 -1)");
			index = scan.nextInt();
			if (index == -1) {
				System.out.println("안녕히가세요");
				System.exit(0);
			}
			if (index >= 1 && index <= 10) {
				break;
			}
			System.out.println("정신차리세요");
		}
	}
	
	
	

}
