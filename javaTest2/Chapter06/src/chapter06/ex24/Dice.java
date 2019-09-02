package chapter06.ex24;

public class Dice {
	private int dice;
	private int face;
	
	public Dice() {
		dice=0;
		face=0;
	}
	
	public int roll() {
		this.face=(int)(Math.random()*6)+1;
		return this.face;
	}
}
