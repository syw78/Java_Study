package chapter16.join;

public class SumClassTest {

	public static void main(String[] args) throws InterruptedException {
		//1. 공유객체를 만든다.
		Data data=new Data();
		System.out.println("1~100합계="+data.getSum());
		//2. 스레드 객체를 만든다.
		Thread thread = new SumClass(data);
		thread.start();
		System.out.println("기다려주세요......");
		thread.join(); // SumClass 스레드가 끝나면 main 스레드가 작동된다
		System.out.println("1~100합계="+data.getSum());
		
	}

}
