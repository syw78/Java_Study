package chapter14.ex2;

public class TryCatchTest {

	public static void main(String[] args) {
		int[] a = new int[5];
		int result=0;
		try {
			for(int i =0;i<a.length;i++) {
				a[i]=i;
			}
			result=a[10];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("오류입니다");
		}
	}

}
