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
		//��������� �ܺ���������ؼ� ���� �ִ°��� ���� ���� �ƴϴ�.(get set)
	}
	

}
