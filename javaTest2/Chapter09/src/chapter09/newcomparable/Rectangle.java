package chapter09.newcomparable;

public class Rectangle implements Comparable {

	// 1. 멤버변수
	public int width;
	public int height;

	// 2.생성자 함수
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	// 3. 멤버함수
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	// 4.오버라이드 함수 구현
	@Override
	public int compareTo(Object obj) {
		Rectangle rectangle = null;
		if (obj instanceof Rectangle) {
			rectangle = (Rectangle) obj;
			if (this.width > rectangle.width) {
				return 1;
			} else if (this.width < rectangle.width) {
				return -1;
			} else {
				return 0;
			}
		}
		return 0;
	}

}
