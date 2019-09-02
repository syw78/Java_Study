package chapter03;

public class Exprint13 {

	public static void main(String[] args) {
		int i=0;
		int j=0;
		int sum=0;
		int result=0;
		int count=0;
		
		for(i=1;i<=6;i++)
		{
			for(j=1;j<=6;j++)
			{
				sum=i+j;
				if(sum==6)
				{
					result=sum;
					count++;
					System.out.printf("(%d,%d) \n",i,j);
				}
			}
		}
		System.out.println("경우의수는"+count);
	}
}
