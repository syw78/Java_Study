package game;

import java.util.Scanner;

public class DieTest {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 2.Die Ŭ������ �̿��Ͽ��� ��ǻ�Ϳ� ����� ���� �ֻ��� ������ �����ϰ� �׽�Ʈ�϶�
		Die userDie = new Die(); // ����ڼ��� �ֻ��� 1
		Die compDie = new Die(); // ����ڼ��� �ֻ��� 1

		while (true) {
			// 1.����ڼ���
			userDie.roll();
			int userValue = userDie.getValue();
			System.out.println("����� �ֻ��� ���� ��=" + userValue);
			compDie.roll();
			int compValue = compDie.getValue();
			System.out.println("��ǻ�� �ֻ��� ���� ��=" + compValue);

			if (userValue == compValue) {
				System.out.println("����� �¸�");
			} else {
				System.out.println("����ڰ� Ʋ�Ƚ��ϴ�.");
			}
			System.out.println("�� ������ �Ͻðڽ��ϱ�?(Y/N)");
			String answer = scan.nextLine();
			if (answer.equals("y") || answer.equals("Y")) {
				continue;
			} else {
				break;
			}
		}
	}
}
