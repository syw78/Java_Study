package chapter09.ex16;


import java.util.Date;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) {
		final double PI = 3.141592;
		//0���� 100������ ���� ����
		int a=(int)(Math.random()*(100-0+1));
		System.out.println(a);
		System.out.println("-----------------------");
		
		//������ȭ��ȣ ����
		String[] strArray = new String[10];
		String str = new String("082-2-777-5566");
		StringTokenizer st = new StringTokenizer(str,"-");
		int i = 0;
		
		while (st.hasMoreTokens()) { // �ܾ�� �߶�����.
			strArray[i++] = st.nextToken();
			// System.out.println(st.nextToken());
			System.out.println(strArray[i - 1]);
		}
		System.out.println("-----------------------");
		//���� ��¥ ���
		Date d= new Date();
		System.out.println(d);
		
		System.out.println("-----------------------");
		
		//��ü���� ��ü�� ���� Ŭ���� �̸� ���
		
		Test test = new Test();
		System.out.println(test.getClass());
		System.out.println("-----------------------");
		
		// 0������ 90������ 5���� �����ϸ鼭 ���ΰ��� ����ϴ� ����
		for (int j = 0; j <= 90; j += 5) {
			System.out.println(j+"��="+Math.sin(Math.toRadians(i)));
		}
	}

}
