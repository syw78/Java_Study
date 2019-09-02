package chapter05.ex15;

public class ComplexNumber {
	private  int real;
	private int imag;
	private int complNum;
	
	public ComplexNumber() {
		real=0;
		imag=0;
		complNum=0;
	}

	public int getReal() {
		return real;
	}
	
	public void setReal(int real) {
		this.real = real;
	}
	
	public int getImag() {
		return imag;
	}
	
	public void setImag(int imag) {
		this.imag = imag;
	}
	
	public int complexNum(int i) {
		complNum=real+imag*i;
		return complNum;
	}
}
