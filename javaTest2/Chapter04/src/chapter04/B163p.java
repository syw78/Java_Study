package chapter04;

public class B163p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE=6;
		int freq[] = new int[SIZE];

		for (int i = 0; i < 10000; i++) 
			++freq[(int)(Math.random()*SIZE)];
	
		System.out.println("===================");
		System.out.println("��    ��");
		System.out.println("===================");
		
		for(int i=0;i<SIZE;i++)
		{
			System.out.println((i+1)+"   "+freq[i]);
		}
	}
}