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
		System.out.println("���� ���� x="+ dx+"���� ���� y= "+dy+"�̵��߽��ϴ�." );
	}
	@Override
	public String toString() {
		return "Circle [dx=" + dx + ", dy=" + dy + "]";
	}
	
}
