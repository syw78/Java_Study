package chapter07.singleton;

public class SingleTon {
	private SingleTon() {
		super();
	}
	
	private static SingleTon singleTon=new SingleTon();    //명시적 초기값
	
	static {
		singleTon = new SingleTon();     // 블럭초기값
	}
	
	public static SingleTon getSingleTon() {
		
		if(singleTon==null) {
			singleTon= new SingleTon();
		}
		
		return singleTon;
	}
	
}
