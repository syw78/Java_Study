package toBinaryString.app;

import java.util.Scanner;

public class ToBinaryTest {
	public static void main(String[] args) {
		int number = 0;

		Scanner inputObject = new Scanner(System.in); // �Է¹޴±��(�ʱ�ȭ ����)
		System.out.print("2�������� �ٲ� �������� �Է��Ͻÿ� : ");
		number = inputObject.nextInt();
		String strValue = ToBinaryString(number);

		System.out.println(number + "���� 2�������� ��ȯ=" + strValue);
	}

	public static String ToBinaryString(int value) {
		String strValue = Integer.toBinaryString(value);
		System.out.println("2�������� ��ȯ�� ���ڿ� ���� :" + strValue.length());
		while(strValue.length()<32){
			strValue="0"+strValue;	
		}
		return strValue;
	}

}