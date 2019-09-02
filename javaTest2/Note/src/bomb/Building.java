package bomb;

public class Building extends Bomb {

	public Building() {
		super();
	}

	public void bomb() {

		System.out.println("빌딩폭파");
	}

	public static void sbomb() {
		System.out.println("Building의 정적 메소드입니다.");

	}
}
