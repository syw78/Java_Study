package chapter16.join;
											//공유 클래스 공유 객체.
public class Data {
	private int sum=0;

	
	//동기화 처리
	public synchronized int getSum() {
		return sum;
	}
	//동기화 처리  2개스레드가 한개의 공유객체를 하기위해 싱크로나이즈를 쓴다.
 	public synchronized void setSum(int sum) {
		this.sum = sum;
	}
	
	
}
