package chapter14.ex07;

public class Test {

	public static void main(String[] args) {
		try {
			int[] array = new int[-10];
			System.out.println("try");
		} catch (NumberFormatException e) {
			System.out.println("���� ���� ����");
		} catch (NegativeArraySizeException e) {
			System.out.println("�迭 ũ�� ���� ����");
		} catch (Exception e) {
			System.out.println("����");
		}
	}
		//�������Ŀ��� ���������⶧���� �������ʰ� �迭ũ�Ⱑ �����̱⋚����
		//�迭 ũ�� ���� ������ ��µȴ�.
}
