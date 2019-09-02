package chapter03;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i=0;
		boolean flag=true;
		double sum=0;
		
		for(i=1;i<=100_000;i=i+2)
		{
			if(flag)
			{
				sum=sum+4/i;	
			}
			else
			{
				sum=sum-4/i;
			}
			flag=!flag;
		}
		System.out.println(sum);
	}

}
