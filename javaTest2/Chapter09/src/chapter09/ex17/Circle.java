package chapter09.ex17;

public class Circle implements Movable {
	private int dx;
	private int dy;

	public Circle(int dx, int dy) {
		super();
		this.dx = dx;
		this.dy = dy;
		System.out.println(this.toString());
	}
	
	@Override
	public void move(int dx, int dy) {
		this.dx=dx;
		this.dy=dy;
		System.out.println("원의 원점 x="+ dx+"원의 원점 y= "+dy+"이동했습니다." );
	}
	@Override
	public String toString() {
		return "Circle [dx=" + dx + ", dy=" + dy + "]";
	}
	
}
