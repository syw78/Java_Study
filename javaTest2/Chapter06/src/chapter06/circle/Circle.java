package chapter06.circle;

public class Circle {

	private int radius;
	private Point point;

	public Circle() {
		this(null, 0);
	}

	public Circle(Point x, int y) {
		this.point = x;
		this.radius = y;
	}

	@Override
	public String toString() {
		return String.format("radius= %3d, %10s", this.radius, this.point);
		// "Circle [radius=" + radius + ", point=" + point + "]";
	}

}
