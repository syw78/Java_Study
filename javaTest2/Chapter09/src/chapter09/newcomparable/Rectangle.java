package chapter09.newcomparable;

public class Rectangle implements Comparable {

	// 1. �������
	public int width;
	public int height;

	// 2.������ �Լ�
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	// 3. ����Լ�
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	// 4.�������̵� �Լ� ����
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
