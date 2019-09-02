package chapter06.ex6;

public class A {
	private int[] a1;
	private int[] a2;

	public A() {
		this.a1 = new int[3];
		this.a2 = new int[a1.length];
	}

	public void sub() {

		int[] a1 = { 3, 4, 5 };
		int[] a2 = modify(a1);
		System.out.println(a1[0]+" "+a1[1]+" "+a1[2]);
		System.out.println(a2[0]+" "+a2[1]+" "+a2[2]);
	}

	public int[] modify(int[] a3) {
		a3[1] = 10;
		return a3;
	}

}
