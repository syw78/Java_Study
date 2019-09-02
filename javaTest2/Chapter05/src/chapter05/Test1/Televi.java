package chapter05.Test1;

public class Televi {

	public static void main(String[] args) {
		
		 Televisi tv=new Televisi();
		 
		 tv.setchannel(20);
		 tv.setvolume(40);
		 tv.setonOff(true);
		 
		 System.out.println(tv.getchannel());
		 System.out.println(tv.getvolume());
		 System.out.println(tv.getonOff());
	}

}
