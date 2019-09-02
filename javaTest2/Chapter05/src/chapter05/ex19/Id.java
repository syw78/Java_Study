package chapter05.ex19;

import java.util.Scanner;

public class Id {

	private String inputId;
	public static final String storeId = "tjdusdn78";

	public Id() {

		inputId = null;
	}

	public void inputId() {

		Scanner scan = new Scanner(System.in);
		System.out.print("아이디를 입력하세요");
		this.inputId = scan.nextLine();
	}

	public void agreementDiscorde() {

		for (;;) {
			if (storeId.equals(inputId)) {
				System.out.println("아이디가 일치합니다 어서오세요");

			} else {

				System.out.println("아이디가 일치하지않습니다 다시 입력해주세요");
				inputId();
				if (storeId.equals(inputId)) {
					System.out.println("아이디가 일치합니다 어서오세요");
				} else {
					continue;
				}
				break;
			}
		}
	}
}
