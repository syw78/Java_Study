package chapter14.ex07;

public class Test {

	public static void main(String[] args) {
		try {
			int[] array = new int[-10];
			System.out.println("try");
		} catch (NumberFormatException e) {
			System.out.println("숫자 형식 오류");
		} catch (NegativeArraySizeException e) {
			System.out.println("배열 크기 음수 오류");
		} catch (Exception e) {
			System.out.println("오류");
		}
	}
		//숫자형식에는 오류가없기때문에 잡히지않고 배열크기가 오류이기떄문에
		//배열 크기 음수 오류가 출력된다.
}
