package chapter04;

import java.util.Arrays;

public class GetMine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int INDEX =10;
		int minimum=0;
		// 1. �������迭��ü�� �����. (s) 10���� �����Ѵ�.
		int[] s = new int[INDEX];
		// 2. �������� 10~50���� �迭��ü �����Ѵ�.
		
		input(s);
		
		//3. ù��° �迭��ü ��Ұ��� minimum������ �����Ѵ�.
		minimum=s[0];
		//4. ��� �迭��ü��Ҹ� ���ʴ�� ���Ͽ� ���� ����.
		for(int i=0;i<INDEX;i++)
		{
			if(minimum>s[i])
			{
				minimum=s[i];
			}
		}
		System.out.println(Arrays.toString(s));
		System.out.println("�ּҰ��� ="+minimum);
	}
	public static void input(int[] s)
	{
		for(int i=0;i<s.length;i++)
		{
			s[i]=(int)(Math.random()*(50-10+1)+10);
		}
		return ;
	}

}
