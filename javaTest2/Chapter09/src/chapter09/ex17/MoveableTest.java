package chapter09.ex17;

public class MoveableTest {
	public static  final int NO=3;
	public static void main(String[] args) {
		Movable[] movable = new Movable[NO];
		movable[0]= new Circle(10,20);
		movable[1]= new Rectangle(10,20);
		movable[2]= new Triangle(10,20);
		
		for(int i =0;i<movable.length;i++) {
			int dx= (int)(Math.random()*(10)+1);
			int dy= (int)(Math.random()*(10)+1);
			movable[i].move(dx, dy);
			
		}
		
	}
}
