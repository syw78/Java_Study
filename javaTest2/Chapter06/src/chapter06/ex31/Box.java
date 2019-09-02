package chapter06.ex31;

public class Box {

	private int height;
	private int volume;
	private int width;
	private boolean empty;
	
	public Box() {
		
		this(0,0,0,false);
		
	}
	public Box(int height, int volume , int width ,boolean empty) {
		
		this.height=height;
		this.volume=volume;
		this.width=width;
		this.empty=empty;
	}
	@Override
	public String toString() {
		return "Box [height=" + height + ", volume=" + volume + ", width=" + width + ", empty=" + empty + "]";
	}
	
}
