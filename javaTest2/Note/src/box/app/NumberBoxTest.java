package box.app;

public class NumberBoxTest {

	public static void main(String[] args) {
		//�����ڸ� 3�� ������
		NumberBox nBox1 = new NumberBox();
		NumberBox nBox2 = new NumberBox(10, 10.0f, 10.0);
		NumberBox nBox3 = new NumberBox(20, 20.0f, 20.0, 'c');
		
		System.out.println(nBox1.toString());    //toString() �ᵵ�ǰ� �Ƚᵵ �ȴ�! ������� ��κ� �Ⱦ��� �츮�� �������� ����.
		System.out.println(nBox2.toString());
		System.out.println(nBox3.toString());
		
		//�޼ҵ� �����ε��Լ� ����Ұ�
		float returnValue=nBox3.calculate(10, 10.0f);
		System.out.println("returnValue="+returnValue);
		double returnValue2 = nBox3.calculate(10, 10.0f, 10.0);
		System.out.println(nBox3);
		System.out.println("returnValue2="+returnValue2);
		System.out.println(nBox3.toString());
	}

}
