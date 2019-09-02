package compareto2;

public class Rectangle implements Comparable {
	public int width;
	public int height;
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	public int compareTo(Object obj) {
		
		Rectangle rectangle=null;
		if(obj instanceof Rectangle) {
			rectangle= (Rectangle)obj;
			if(this.width>rectangle.width) {
				return 1;
			}else if(this.width<rectangle.width) {
				return -1;
			}else {
				return 0;
			}
		}
		return 0;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	
	
	
}
