package chapter04;

import java.util.Scanner;

public class Exprint21 {

		public static void main(String[] args) {
		      String[] hexa2bin = {"0000", "0001", "0010", "0011",
		                "0100", "0101", "0110", "0111",
		                "1000", "1001", "1010", "1011",
		                "1100", "1101", "1110", "1111"};
		      Scanner scan=new Scanner(System.in);
		      
		      System.out.print("16진수 문자열을 입력하시오 : ");
		      String hexa=scan.nextLine();
		      System.out.print("\""+hexa+"\"에 대한 이진수는 ");
		      for(int i=0;i<hexa.length();i++) {
		         switch(hexa.charAt(i)) {
		         case 48:
		            System.out.print(hexa2bin[0]+" ");break;
		         case 49:
		            System.out.print(hexa2bin[1]+" ");break;
		         case 50:
		            System.out.print(hexa2bin[2]+" ");break;
		         case 51:
		            System.out.print(hexa2bin[3]+" ");break;
		         case 52:
		            System.out.print(hexa2bin[4]+" ");break;
		         case 53:
		            System.out.print(hexa2bin[5]+" ");break;
		         case 54:
		            System.out.print(hexa2bin[6]+" ");break;
		         case 55:
		            System.out.print(hexa2bin[7]+" ");break;
		         case 56:
		            System.out.print(hexa2bin[8]+" ");break;
		         case 57:
		            System.out.print(hexa2bin[9]+" ");break;
		         case 97:
		            System.out.print(hexa2bin[10]+" ");break;
		         case 98:
		            System.out.print(hexa2bin[11]+" ");break;
		         case 99:
		            System.out.print(hexa2bin[12]+" ");break;
		         case 100:
		            System.out.print(hexa2bin[13]+" ");break;
		         case 101:
		            System.out.print(hexa2bin[14]+" ");break;
		         case 102:
		            System.out.print(hexa2bin[15]+" ");break;
		         
		         }     
		      }
		      System.out.println("입니다.");
		   }
	}


