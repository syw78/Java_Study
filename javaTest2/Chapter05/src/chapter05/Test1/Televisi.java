package chapter05.Test1;

public class Televisi {

	//멤버변수 
	 private int channel;
	 private int volume;
	 private boolean onOff;
	
	//생성자함수 
	public Televisi() {
		channel=0;
		volume=0;
		onOff=false;
	}
	//멤버함수
	
	public void setchannel(int channel) {
		this.channel=channel;
	}
	public void setvolume(int volume) {
		this.volume=volume;
	}public void setonOff(boolean onOff) {
		this.onOff=onOff;
	}
	public int getchannel() {
		return channel;
	}
	public int getvolume() {
		return volume;
	}
	public boolean getonOff() {
		return onOff;
	}
	
	
	
}
