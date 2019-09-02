package chapter04;

import java.util.Arrays;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 상수를 정의한다(심볼릭 상수:변수형 상수 COUNT 10
		final int COUNT = 10;
		//1.1 총합계 변수를 선언한다.
		int total=0;
		// 2. 1차원 정수형배열클래스를 객체화한다. 생성자값은 COUNT
		int[] score=  new int[] {10,20,30,40,50};
		// 3. 반복문을 선언한다
		for(int i=0;i<score.length;i++)
		{
			// 3.1 랜덤처리한다.(50~100)
			//score[i]=(int)(Math.random()*(100-50+1)+50);
			// 3.2 배열원소에있는값들을 누적한다.
			total+=score[i];
		}
		System.out.println(Arrays.toString(score)+"총합계 :"+total+"평균은"+(total/score.length));
	}

}
