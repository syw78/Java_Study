package chapter07.ex5;

public class MountainBike extends Bike {
	public int seatHeight;
	public void MountainBike(int g) {
		//super();  //void가 없어야한다 void가 있음으로서 메소드가 되었다.
		//gear=g; //Bike클래스에서 pirvate으로 gear를 만들었기때문에 불러올수없다.
				   //부르려면 getter setter를 사용하여야 한다.
	}
}
