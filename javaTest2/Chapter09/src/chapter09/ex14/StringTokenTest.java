package chapter09.ex14;

import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

public class StringTokenTest {

	public static void main(String[] args) {
		// 1���� 10������ ����
		int a = (int) (Math.random() * (10 - 1 + 1) + 1);
		// ���ڿ� �ܾ�� �и�
		String[] strArray = new String[10];
		String str = new String("By doubting we come at the truth");
		StringTokenizer st = new StringTokenizer(str);
		int i = 0;

		while (st.hasMoreTokens()) { // �ܾ�� �߶�����.
			strArray[i++] = st.nextToken();
			// System.out.println(st.nextToken());
			System.out.println(strArray[i - 1]);
		}
		System.out.println("-------------------------------");
		// ���� ��¥�� �������ִ� Calendar ��ü

		Calendar cal = Calendar.getInstance(); // ��¥ ���ϴ� ��ü
		System.out.println("year" + cal.get(Calendar.YEAR));
		System.out.println("month" + (cal.get(Calendar.MONTH) + 1));
		System.out.println("day" + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("hour" + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("minute" + cal.get(Calendar.MINUTE));
		System.out.println("second" + cal.get(Calendar.SECOND));
		System.out.println("-------------------------------");
		//double���� 1���� �迭 dArray�� ����
		double[] dArray= new double[10];
		for( i=0;i<dArray.length;i++) {
			dArray[i]=(double)(Math.random()*(20-1+1)+1);
		}
		Arrays.sort(dArray); //������� ����
		System.out.print(Arrays.toString(dArray)); //�迭�ȿ� ������ ��������
		System.out.println("-------------------------------");
		String num = "12345";
		System.out.println();
		int j = Integer.parseInt(num); //���ڿ��� ������ �ٲ��ִ� ��
		System.out.println(j+1);
		System.out.println("-------------------------------");
		
		// Ŭ���� �̸� ���
		Class<?>c1 = str.getClass();
		System.out.println(c1.getName());
		System.out.println("-------------------------------");
		
		
	}
}
