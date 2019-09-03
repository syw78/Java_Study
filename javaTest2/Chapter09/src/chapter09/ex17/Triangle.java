package chapter09.ex17;

public class Triangle implements Movable {
	private int dx;
	private int dy;
	
	
	public Triangle(int dx, int dy) {
		super();
		this.dx = dx;
		this.dy = dy;
		System.out.println(this.toString());
	}
	@Override
	public void move(int dx, int dy) {
		this.dx=dx;
		this.dy=dy;
		System.out.println("삼각형의 원점 x="+ dx+"삼각형의 원점 y= "+dy+"이동했습니다." );
	}
	@Override
	public String toString() {
		return "Triangle [dx=" + dx + ", dy=" + dy + "]";
	}

}
