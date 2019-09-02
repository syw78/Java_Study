package chapter03;

public class Exprint20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2와 100사이 소수 프로그램 변수 k=2 k-1 소수 
		
		int k=0,j=0;
		int count=0;
		for(k=2;k<=100;k++)
		{
			count=0;
			for(j=2;j<k;j++)
			{
				if(k%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(k);
			}
		}
	}
}
