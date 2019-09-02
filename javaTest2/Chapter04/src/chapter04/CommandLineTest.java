package chapter04;

public class CommandLineTest {

	public static void main(String[] args) {
		for(String str : args ) {
			if(str.equals("-h")) {
			System.out.println("help");
			}else {
				System.out.println(str);
			}
		}
	}

}
