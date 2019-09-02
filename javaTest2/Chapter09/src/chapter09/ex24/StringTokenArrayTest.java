package chapter09.ex24;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenArrayTest {

	public static void main(String[] args) {
		//�ܾ���� ���ڿ� �迭�� �ְ�
		//�� �迭�� Arrays�� sort(0�޼ҵ带 �̿��Ͽ� ����
		String[] strArray= null;
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڿ��Է¿��:");
		String str = scan.nextLine();
		
		StringTokenizer st=new StringTokenizer(str);
		strArray = new String[st.countTokens()];
		int i=0;
		while(st.hasMoreTokens()) {
			strArray[i++]=st.nextToken();
		}
		
		for(String string:strArray) {
			System.out.print(string+" ");
		}
		Arrays.sort(strArray);
		System.out.println(" ");
		for(String string:strArray) {
			System.out.print(string+" ");
		}
	}

}
