package chapter05.numberbox;

public class NumberBox {
	private int ivalue;
	private float fvalue;
	private float result;
	
	public NumberBox(int ivalue,float fvalue) {
		
		this.ivalue=ivalue;
		this.fvalue=fvalue;
	}
	public void setIvalue(int ivalue) {
		
		this.ivalue=ivalue;
	}
	public void setFvalue(float fvalue) {
		this.fvalue=fvalue;
	}
	public int getIvalue() {
		return ivalue;
	}
	public float getfvalue() {
		return fvalue;
	}
	public float multy() {
		result=ivalue*fvalue;
		
		return result;
	}
}
