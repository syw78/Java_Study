package chapter07.poly;

public abstract class Bomb {

	public Bomb() {
		super();
	}
	public abstract void bomb();
	
	public static void sbomb() {
		System.out.println("Bomb의 정적 메소드입니다.");
	}
	
}
