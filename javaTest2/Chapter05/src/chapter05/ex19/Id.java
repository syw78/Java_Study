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
		System.out.print("���̵� �Է��ϼ���");
		this.inputId = scan.nextLine();
	}

	public void agreementDiscorde() {

		for (;;) {
			if (storeId.equals(inputId)) {
				System.out.println("���̵� ��ġ�մϴ� �������");

			} else {

				System.out.println("���̵� ��ġ�����ʽ��ϴ� �ٽ� �Է����ּ���");
				inputId();
				if (storeId.equals(inputId)) {
					System.out.println("���̵� ��ġ�մϴ� �������");
				} else {
					continue;
				}
				break;
			}
		}
	}
}
