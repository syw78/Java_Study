package chapter09.ex17;

public class Rectangle implements Movable {
	private int dx;
	private int dy;

	public Rectangle(int dx, int dy) {
		super();
		this.dx = dx;
		this.dy = dy;
		System.out.println(this.toString());
	}
	
	@Override
	public void move(int dx, int dy) {
		this.dx=dx;
		this.dy=dy;
		System.out.println("�簢���� ���� x="+ dx+"�簢���� ���� y= "+dy+"�̵��߽��ϴ�." );
	}
	@Override
	public String toString() {
		return "Rectangle [dx=" + dx + ", dy=" + dy + "]";
	}

}
