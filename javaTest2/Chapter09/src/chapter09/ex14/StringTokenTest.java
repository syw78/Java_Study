package chapter09.ex14;

import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

public class StringTokenTest {

	public static void main(String[] args) {
		// 1부터 10까지의 난수
		int a = (int) (Math.random() * (10 - 1 + 1) + 1);
		// 문자열 단어로 분리
		String[] strArray = new String[10];
		String str = new String("By doubting we come at the truth");
		StringTokenizer st = new StringTokenizer(str);
		int i = 0;

		while (st.hasMoreTokens()) { // 단어별로 잘라진다.
			strArray[i++] = st.nextToken();
			// System.out.println(st.nextToken());
			System.out.println(strArray[i - 1]);
		}
		System.out.println("-------------------------------");
		// 어제 날짜를 가지고있는 Calendar 객체

		Calendar cal = Calendar.getInstance(); // 날짜 구하는 객체
		System.out.println("year" + cal.get(Calendar.YEAR));
		System.out.println("month" + (cal.get(Calendar.MONTH) + 1));
		System.out.println("day" + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("hour" + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("minute" + cal.get(Calendar.MINUTE));
		System.out.println("second" + cal.get(Calendar.SECOND));
		System.out.println("-------------------------------");
		//double형의 1차원 배열 dArray를 정렬
		double[] dArray= new double[10];
		for( i=0;i<dArray.length;i++) {
			dArray[i]=(double)(Math.random()*(20-1+1)+1);
		}
		Arrays.sort(dArray); //순서대로 정렬
		System.out.print(Arrays.toString(dArray)); //배열안에 값들을 나열해줌
		System.out.println("-------------------------------");
		String num = "12345";
		System.out.println();
		int j = Integer.parseInt(num); //문자열을 정수로 바꿔주는 법
		System.out.println(j+1);
		System.out.println("-------------------------------");
		
		// 클래스 이름 출력
		Class<?>c1 = str.getClass();
		System.out.println(c1.getName());
		System.out.println("-------------------------------");
		
		
	}
}
