package chapter05.numberbox;

public class NumberBoxTest {

	public static void main(String[] args) {
		NumberBox numBox= new NumberBox(10,1.2345f);
		
		System.out.println(numBox.getIvalue()+" "+numBox.getfvalue());
		numBox.setIvalue(20);
		numBox.setFvalue(5.435f);
		
		System.out.println(numBox.getIvalue()+" "+numBox.getfvalue());
		
		System.out.println(numBox.multy());
	}

}
