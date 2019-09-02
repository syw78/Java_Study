package freedrive;

public class Test {

	public static void main(String[] args) {
		Operator [] ope = {new Bus(),new Car()};
		
		for(int i=0;i<ope.length;i++) {
			ope[i].start();
			ope[i].stop();
			ope[i].setSpeed(30);
			ope[i].turn(15);
		}
		
	}

}
