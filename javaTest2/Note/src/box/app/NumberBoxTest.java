package box.app;

public class NumberBoxTest {

	public static void main(String[] args) {
		//생성자를 3개 만들어라
		NumberBox nBox1 = new NumberBox();
		NumberBox nBox2 = new NumberBox(10, 10.0f, 10.0);
		NumberBox nBox3 = new NumberBox(20, 20.0f, 20.0, 'c');
		
		System.out.println(nBox1.toString());    //toString() 써도되고 안써도 된다! 사람들은 대부분 안쓴다 우리는 배우는입장 쓴다.
		System.out.println(nBox2.toString());
		System.out.println(nBox3.toString());
		
		//메소드 오버로딩함수 사용할것
		float returnValue=nBox3.calculate(10, 10.0f);
		System.out.println("returnValue="+returnValue);
		double returnValue2 = nBox3.calculate(10, 10.0f, 10.0);
		System.out.println(nBox3);
		System.out.println("returnValue2="+returnValue2);
		System.out.println(nBox3.toString());
	}

}
