package chapter09.ex9;

public class Test {

	public static void main(String[] args) {
		Desk desk = new Desk();
		Movable m = desk;
		desk=(Desk) m;
	}

}
