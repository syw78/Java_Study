package chapter04;

import java.util.Arrays;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. ����� �����Ѵ�(�ɺ��� ���:������ ��� COUNT 10
		final int COUNT = 10;
		//1.1 ���հ� ������ �����Ѵ�.
		int total=0;
		// 2. 1���� �������迭Ŭ������ ��üȭ�Ѵ�. �����ڰ��� COUNT
		int[] score=  new int[] {10,20,30,40,50};
		// 3. �ݺ����� �����Ѵ�
		for(int i=0;i<score.length;i++)
		{
			// 3.1 ����ó���Ѵ�.(50~100)
			//score[i]=(int)(Math.random()*(100-50+1)+50);
			// 3.2 �迭���ҿ��ִ°����� �����Ѵ�.
			total+=score[i];
		}
		System.out.println(Arrays.toString(score)+"���հ� :"+total+"�����"+(total/score.length));
	}

}
