package chapter06.ex24;

public class DiceTest {

	public static void main(String[] args) {
		Dice dice = new Dice();
		
		for(int i=0;i<5;i++) {
			System.out.println(dice.roll());
		}
	}

}
