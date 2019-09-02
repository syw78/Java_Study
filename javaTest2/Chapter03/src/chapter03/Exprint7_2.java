package chapter03;

public class Exprint7_2 {

	public static void main(String[] args) {
		int i=0;
		int j=0;
		int num=0;
		
		for(i=10;i<=30;i++)
		{
			for(j=0;j<=5;j++)
			{
				num=i*j+num;
			}
			
		}
		System.out.println(num);
	}

}
