package chapter05.ex18;

import java.util.Scanner;

public class Consonants {
	private String str;
	private int conto;
	private int vowel;
	
	public Consonants() {
		str=null;
		conto=0;
		vowel=0;
	}
	
	public void inputAlphabet() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ���");
		str=scan.nextLine();
	}
	public void calculate() {
		
		for(int i=0;i<str.length();i++) {
			
			switch(str.charAt(i)) {
			
			case 'a': case 'e': case 'i': case 'o': case 'u': 
				vowel++; break;
			default :
				conto ++; break;
			}
		}
		System.out.println("����="+conto);
		System.out.println("����="+vowel);
	}
}
