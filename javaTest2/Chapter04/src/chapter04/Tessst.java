package chapter04;

public class Tessst {
	public static void main(String[] args) {
		String[] card = new String[] { "Clubs", "Diamonds", "Hearts", "Spades" }; // 4
		String[] numNoble = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King","Ace" }; // 14
		
		int cardRandomNum = (int) (Math.random() * (3 - 0 + 1));// ���ڸ� �̴´�.
		
		int numNobleRandom = (int) (Math.random() * (13 - 0 + 1));// ���ڸ� �̴´�.

		System.out.print(card[cardRandomNum] + "��");

		System.out.print(" " + numNoble[numNobleRandom]);
	}
}
