package chapter05.box2;

public class NumberBox {
	// �������
	private int ivalue;
	private float fvalue;
	private double dvalue;
	private char cvalue;

	// ������ �Լ�
	public NumberBox() {
		ivalue = 0;
		fvalue = 0f;              //����Ʈ������
		dvalue = 0.0;
		cvalue = 65;
	}
	public NumberBox(int ivalue, float fvalue, double dvalue) {
		this.ivalue = ivalue;
		this.fvalue = fvalue;   //�Ű�����������
		this.dvalue = dvalue;
		this.cvalue = 65;
	}
	public NumberBox(int ivalue, float fvalue, double dvalue, char cvalue) {
		this.ivalue = ivalue;
		this.fvalue = fvalue;
		this.dvalue = dvalue;							//�Ű�����������
		this.cvalue = cvalue;
	}
	//�ν��Ͻ� ����Լ� �����ε�
	
	public float calculate(int ivalue,float fvalue) {
		this.ivalue+=ivalue; this.fvalue+=fvalue;
		return this.ivalue*this.fvalue;
	}
	public double calculate(int ivalue,float fvalue, double dvalue) {
		this.ivalue+=ivalue; this.fvalue+=fvalue; this.dvalue+=dvalue;
		return this.ivalue+this.fvalue+this.dvalue;
	}
	@Override //������̼� ���Լ��� �������̵��̾�! ���������� �˷��ش�.
	public String toString() {
		return "NumberBox [ivalue=" + ivalue + ", fvalue=" + fvalue + ", dvalue=" + dvalue + ", cvalue=" + cvalue + "]";
	}
	
	//�ν��Ͻ� toString;
}
