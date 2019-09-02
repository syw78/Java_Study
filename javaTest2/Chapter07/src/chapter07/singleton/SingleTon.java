package chapter07.singleton;

public class SingleTon {
	private SingleTon() {
		super();
	}
	
	private static SingleTon singleTon=new SingleTon();    //����� �ʱⰪ
	
	static {
		singleTon = new SingleTon();     // ���ʱⰪ
	}
	
	public static SingleTon getSingleTon() {
		
		if(singleTon==null) {
			singleTon= new SingleTon();
		}
		
		return singleTon;
	}
	
}
