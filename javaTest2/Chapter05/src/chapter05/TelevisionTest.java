package chapter05;

public class TelevisionTest {

	public static void main(String[] args) {
		
		Television television = new Television();
		television.setChannel(20);
		television.setVolume(40);
		television.setBoolean(true);
		
		System.out.println("television.channel="+television.getChannel());
		System.out.println("television.volume="+television.getVolume());
		System.out.println("television.onOff="+television.getonOff());
		//멤버변수에 외부접근허용해서 값을 주는것은 좋은 예가 아니다.(get set)
	}
	

}
