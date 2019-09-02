package chapter09.ex16;


import java.util.Date;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) {
		final double PI = 3.141592;
		//0부터 100사이의 난수 생성
		int a=(int)(Math.random()*(100-0+1));
		System.out.println(a);
		System.out.println("-----------------------");
		
		//국제전화번호 추출
		String[] strArray = new String[10];
		String str = new String("082-2-777-5566");
		StringTokenizer st = new StringTokenizer(str,"-");
		int i = 0;
		
		while (st.hasMoreTokens()) { // 단어별로 잘라진다.
			strArray[i++] = st.nextToken();
			// System.out.println(st.nextToken());
			System.out.println(strArray[i - 1]);
		}
		System.out.println("-----------------------");
		//오늘 날짜 출력
		Date d= new Date();
		System.out.println(d);
		
		System.out.println("-----------------------");
		
		//객체생성 객체를 통해 클래스 이름 출력
		
		Test test = new Test();
		System.out.println(test.getClass());
		System.out.println("-----------------------");
		
		// 0도부터 90도까지 5도씩 증가하면서 싸인값을 출력하는 루프
		for (int j = 0; j <= 90; j += 5) {
			System.out.println(j+"도="+Math.sin(Math.toRadians(i)));
		}
	}

}
