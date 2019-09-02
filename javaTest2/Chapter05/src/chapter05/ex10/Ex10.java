package chapter05.ex10;

public class Ex10 {

	public static void main(String[] args) {
		String a= "javaprogramming";
		a= a.substring(5,7);  //r o ±ÛÀÚ »Ì¾Æ³¿ ´Ù¼¸¹øÂ°¿¡¼­ ÀÏ°ö¹øÂ° Àü±îÁö »Ì¾Æ³¿
		char b = a.charAt(1);
		a= a+b;
		System.out.println(a);
	}

}
