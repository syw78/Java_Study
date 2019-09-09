package chapter15.searchtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchTest {

	public static void main(String[] args) {
		//1.arraylist integer 선언
		List<Integer> list = new ArrayList<Integer>();
		//2. 랜덤값으로 1~100사이를 100개 입력하세요
		
		for(int i=0;i<100;i++) {
			
			list.add((int)(Math.random()*(100-1+1)+1));
			System.out.print(" "+list.get(i));
		}
		long start1=System.nanoTime(); //외워라
		for(int i=0;i<100;i++) {
			if(list.get(i)==10) {
				break;
			}
		}
		long stop1=System.nanoTime(); //외워라
		System.out.println("\n"+"일반방법검색처리="+(stop1-start1));
		//3. 정렬시킬것
		System.out.println();
		Collections.sort(list);
		for(Integer i:list) {
			System.out.print(" "+i);
		}
		long start =System.nanoTime();
		int index = Collections.binarySearch(list,10);	 //이 방법이 빠르다
		long stop = System.nanoTime();
		System.out.println("\n"+index+" "+(stop-start));
		
		
	}

}
