package chapter07.poly;

public class House extends Bomb{
	public House() {
		super();
	}
	public  void bomb() {
		System.out.println("집 폭파");
	}
	
	public static void sbomb() {
		System.out.println("House의 정적 메소드입니다.");
	}

}
