package game;

public class Die {

	private int value;

	public Die() {
		super();
		this.value = 1;
	}

	public int roll() {
		value=(int) (Math.random() * (6) + 1);
		return value;
	}

//	Die(): 주사위 면을 1로 초기화
//	-int roll():1부터 6까지의 숫자를 반환한다.
//	-void setValue(int v): 주사위 면을 설정한다
//	-int getValue():현재 주사위 면을 반환한다.
//	-String toStirng():현재 주사위의 상태를 문자열로 반환한다.
//	2.Die 클래스를 이용하여서 컴퓨터와 사용자 간의 주사위 게임을 구현하고 테스트하라
//	3.game패키지를 생성하고 전체소스를 게임 패키지에 추가한다.
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
		if (value < 1 || value > 6) {
			System.out.println("주사위범위를 벗어났습니다. 다시 하세요");
			value = 1;
		}
	}

	@Override
	public String toString() {
		return "Die [value=" + value + "]";
	}
}
