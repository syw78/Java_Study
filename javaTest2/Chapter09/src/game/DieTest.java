package game;

import java.util.Scanner;

public class DieTest {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 2.Die 클래스를 이용하여서 컴퓨터와 사용자 간의 주사위 게임을 구현하고 테스트하라
		Die userDie = new Die(); // 사용자선택 주사위 1
		Die compDie = new Die(); // 사용자선택 주사위 1

		while (true) {
			// 1.사용자선택
			userDie.roll();
			int userValue = userDie.getValue();
			System.out.println("사용자 주사위 선택 값=" + userValue);
			compDie.roll();
			int compValue = compDie.getValue();
			System.out.println("컴퓨터 주사위 선택 값=" + compValue);

			if (userValue == compValue) {
				System.out.println("사용자 승리");
			} else {
				System.out.println("사용자가 틀렸습니다.");
			}
			System.out.println("더 게임을 하시겠습니까?(Y/N)");
			String answer = scan.nextLine();
			if (answer.equals("y") || answer.equals("Y")) {
				continue;
			} else {
				break;
			}
		}
	}
}
