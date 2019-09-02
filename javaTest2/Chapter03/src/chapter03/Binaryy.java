package chapter03;

public class Binaryy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=0;
		String binary=null;
		for(int i=0;i<10;i++)
		{
			number=(int)(Math.random()*(150-50+10)+50);
			binary=toBinaryString(number);
			System.out.println((i+1)+"¹øÂ° "+number+" "+binary );
		}
		
	}
	public static String toBinaryString(int value)
	{
		String binary=null;
		binary=Integer.toBinaryString(value);
		while(binary.length()<=16)
		{
			binary="0"+binary;
		}
				return binary;
	}
}
