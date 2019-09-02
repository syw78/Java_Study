package chapter04;


public class Exprint18 {

	public static void main(String[] args) {
		String [] card=new String[] {"Clubs","Diamonds","Hearts","Spades"}; //4
		String [] numNoble=new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" }; //14
		int cardRandomNum=(int)(Math.random()*(3-0+1));//숫자를 뽑는다.
		int numNobleRandom=(int)(Math.random()*(13-0+1));//숫자를 뽑는다.
		
		for(int i=0;i<4;i++)
		{
			if(card[i]==card[cardRandomNum])
			{
				System.out.print(card[i]+"의");
			}
		}
		for(int i=0;i<14;i++)
		{
			if(numNoble[i]==numNoble[numNobleRandom])
			{
				System.out.print(" "+numNoble[i]);
			}
		}
	
	}

}
