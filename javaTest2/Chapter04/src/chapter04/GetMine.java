package chapter04;

import java.util.Arrays;

public class GetMine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int INDEX =10;
		int minimum=0;
		// 1. 정수형배열객체를 만든다. (s) 10개를 선언한다.
		int[] s = new int[INDEX];
		// 2. 랜덤으로 10~50까지 배열객체 저장한다.
		
		input(s);
		
		//3. 첫번째 배열객체 요소값을 minimum값으로 저장한다.
		minimum=s[0];
		//4. 모든 배열객체요소를 차례대로 비교하여 값을 수정.
		for(int i=0;i<INDEX;i++)
		{
			if(minimum>s[i])
			{
				minimum=s[i];
			}
		}
		System.out.println(Arrays.toString(s));
		System.out.println("최소값은 ="+minimum);
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
