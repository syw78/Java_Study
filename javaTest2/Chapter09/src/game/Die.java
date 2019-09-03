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

//	Die(): �ֻ��� ���� 1�� �ʱ�ȭ
//	-int roll():1���� 6������ ���ڸ� ��ȯ�Ѵ�.
//	-void setValue(int v): �ֻ��� ���� �����Ѵ�
//	-int getValue():���� �ֻ��� ���� ��ȯ�Ѵ�.
//	-String toStirng():���� �ֻ����� ���¸� ���ڿ��� ��ȯ�Ѵ�.
//	2.Die Ŭ������ �̿��Ͽ��� ��ǻ�Ϳ� ����� ���� �ֻ��� ������ �����ϰ� �׽�Ʈ�϶�
//	3.game��Ű���� �����ϰ� ��ü�ҽ��� ���� ��Ű���� �߰��Ѵ�.
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
		if (value < 1 || value > 6) {
			System.out.println("�ֻ��������� ������ϴ�. �ٽ� �ϼ���");
			value = 1;
		}
	}

	@Override
	public String toString() {
		return "Die [value=" + value + "]";
	}
}
