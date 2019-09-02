package chapter03;

public class Exprint21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Á÷°¢ »ï°¢Çü  a b ºøº¯ c a*a+b*b=c*c
		int a=0,b=0,c=0;
		int count=0;
		
		for(a=1;a<=100;a++)
		{
			for(b=1;b<=100;b++)
			{
				for(c=1;c<=100;c++)
				{
					if( a*a+b*b==c*c)     
					{
						count++;
						
						System.out.println(a+" "+b+" "+c);
					}
				}
			}
		}
		System.out.println(count);
	}
}
