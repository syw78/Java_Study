package chapter05.box2;

public class NumberBox {
	// 멤버변수
	private int ivalue;
	private float fvalue;
	private double dvalue;
	private char cvalue;

	// 생성자 함수
	public NumberBox() {
		ivalue = 0;
		fvalue = 0f;              //디폴트생성자
		dvalue = 0.0;
		cvalue = 65;
	}
	public NumberBox(int ivalue, float fvalue, double dvalue) {
		this.ivalue = ivalue;
		this.fvalue = fvalue;   //매개변수생성자
		this.dvalue = dvalue;
		this.cvalue = 65;
	}
	public NumberBox(int ivalue, float fvalue, double dvalue, char cvalue) {
		this.ivalue = ivalue;
		this.fvalue = fvalue;
		this.dvalue = dvalue;							//매개변수생성자
		this.cvalue = cvalue;
	}
	//인스턴스 멤버함수 오버로딩
	
	public float calculate(int ivalue,float fvalue) {
		this.ivalue+=ivalue; this.fvalue+=fvalue;
		return this.ivalue*this.fvalue;
	}
	public double calculate(int ivalue,float fvalue, double dvalue) {
		this.ivalue+=ivalue; this.fvalue+=fvalue; this.dvalue+=dvalue;
		return this.ivalue+this.fvalue+this.dvalue;
	}
	@Override //어노테이션 이함수는 오버라이딩이야! 컴파일한테 알려준다.
	public String toString() {
		return "NumberBox [ivalue=" + ivalue + ", fvalue=" + fvalue + ", dvalue=" + dvalue + ", cvalue=" + cvalue + "]";
	}
	
	//인스턴스 toString;
}
