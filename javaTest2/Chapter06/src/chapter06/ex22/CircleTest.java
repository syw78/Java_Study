package chapter06.ex22;

public class CircleTest {

	public static void main(String[] args) {
		Circle cir= new Circle();
		cir.setR(3.5);
		cir.setCx(10);
		cir.setCy(20);
		
		System.out.println("������="+cir.getR()+"��ǥ="+cir.getCx()+" "+cir.getCy());
		System.out.println("���� ����="+cir.area());
	}

}