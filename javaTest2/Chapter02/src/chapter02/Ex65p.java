package chapter02;

public class Ex65p {

	public static void main(String[] args) {
		long lightspeed=0L;
		long distance=0L;
		
		lightspeed=300_000;
		
		distance=lightspeed*365*24*60*60;
		System.out.println("���� �Ÿ���"+distance+"km.");
		System.out.printf("���� �Ÿ��� %d km.",distance);
	}

}
