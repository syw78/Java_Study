package chapter05;

public class Television {

	// 1.멤버변수
	private int channel;
	private int volume;
	private boolean onOff;

	// 2.생성자함수

	public Television() {
		this.channel = 0;
		this.volume = 0;
		this.onOff = false;
	}

	// 3.멤버함수.
	public void setChannel(int channel) {
		this.channel = channel;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void setBoolean(boolean onOff) {
		this.onOff = onOff;
	}

	public int getChannel() {

		return this.channel;
	}

	public int getVolume() {

		return this.volume;
	}

	public boolean getonOff() {

		return this.onOff;
	}

}
