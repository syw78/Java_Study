package chapter05.ex11;

public class Ex11 {

	public static void main(String[] args) {
		String x = "abc";
		String a=x.toUpperCase(); //소문자를 대문자로 바꿔주는 함수.
		String y = a.replace('A', 'd'); //대체하다
		y = y + "xyz";
		System.out.println(y);
	}
}
