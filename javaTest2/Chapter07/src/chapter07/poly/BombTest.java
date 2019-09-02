package chapter07.poly;

public class BombTest {

	public static void main(String[] args) {
		Bomb[] bom = { new Building(), new Car(), new House(), new Tree() };

		for (int i = 0; i < bom.length; i++) {

			bom[i].bomb();

		}
		for (int i = 0; i < bom.length; i++) {

			bom[i].sbomb();
			
		}
		for (int i = 0; i < bom.length; i++) {

			if(bom[i] instanceof Building) {
				((Building)bom[i]).sbomb();
			}else if(bom[i] instanceof Car) {
				((Car)bom[i]).sbomb();
			}else if(bom[i] instanceof House) {
				((House)bom[i]).sbomb();
			}else if(bom[i] instanceof Tree) {
				((Tree)bom[i]).sbomb();
			}

		}
	}
}
