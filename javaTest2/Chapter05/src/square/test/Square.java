package square.test;

public class Square {
	
	private int height;
	private int width;
	private int distance; //�ν��Ͻ��������
	private int area;
	
	public Square() {
		height=0;
		width=0;				//�������Լ�
		distance=0;
		area=0;
	}
	
	public void setheight(int a) {
		this.height=a;
	}
	public void setwidth(int b) { //�ν��Ͻ�����Լ�
		this.width=b;
	}
	public int getheight() {
		return height;
	}
	public int getwidth() {
		return width;
	}
	
	public int squareDis() {
		distance=height+height+width+width; //�ν��Ͻ�����Լ�
		
		return distance;
	}
	public int squareArea() {
		area=height*width;
		return area;
	}
}
