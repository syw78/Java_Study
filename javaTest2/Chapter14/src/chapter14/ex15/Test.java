package chapter14.ex15;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int[] array = {1,2,3};
		searchArray(array);
	}
	
	public static void searchArray(int[] array) {
		Scanner scan= new Scanner(System.in);
		System.out.println("원하는 숫자를 입력하세요");
		int number = scan.nextInt();
		for(int i=0;i<array.length;i++) {
			if(number==array[i]) {
				System.out.println("있습니다."); 
				System.exit(0);
			}
			}
		System.out.println(new NotFoundException("없습니다 오류"));
		}

}
