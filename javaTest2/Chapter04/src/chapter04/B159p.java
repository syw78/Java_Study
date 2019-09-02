package chapter04;

public class B159p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prices[] =new int[10];
		int i=0;
	
		for(i=0;i<prices.length;i++)
		{
			prices[i]=(int)(Math.random()*(100-1+1)+1);
			System.out.print(prices[i]+" ");
		}
		int max=prices[0];
		int min=prices[0];
		
		for(i=0;i<prices.length;i++)
		{
			if(max<prices[i])
			{
				max=prices[i];
			}
			else if(min>prices[i])
			{
				min=prices[i];
			}
		}
		System.out.println();
		System.out.println("ÃÖ´ñ°ª :"+max);
		System.out.println("ÃÖ¼Ú°ª :"+min);
		
	}

}
