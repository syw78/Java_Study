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
		System.out.println("�ﰢ���� ���� x="+ dx+"�ﰢ���� ���� y= "+dy+"�̵��߽��ϴ�." );
	}
	@Override
	public String toString() {
		return "Triangle [dx=" + dx + ", dy=" + dy + "]";
	}

}
