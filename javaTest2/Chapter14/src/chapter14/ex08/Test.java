package chapter14.ex08;

import javax.management.RuntimeErrorException;

public class Test {

	public static void throwit() {
		System.out.println("A");
		throw new RuntimeException();
	}
	
	public static void main(String[] args) {
		try {
			System.out.println("B");
			throwit();
		}catch(Exception e) {
			System.out.println("C");
		}finally {
			System.out.println("D");
		}
		System.out.println("E");
	}

}
