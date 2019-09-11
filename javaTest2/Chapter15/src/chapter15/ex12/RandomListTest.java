package chapter15.ex12;

public class RandomListTest {

	public static void main(String[] args) {
		RandomList random =new RandomList<String>();
		random.add("Å¸Á¶");
		random.add("Âü»õ");
		random.add("´ß");
		
		
		System.out.println(random.getObj());
		random.iterPrint();
	}

}
