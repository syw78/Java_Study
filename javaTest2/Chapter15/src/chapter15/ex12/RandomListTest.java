package chapter15.ex12;

public class RandomListTest {

	public static void main(String[] args) {
		RandomList random =new RandomList<String>();
		random.add("Ÿ��");
		random.add("����");
		random.add("��");
		
		
		System.out.println(random.getObj());
		random.iterPrint();
	}

}
