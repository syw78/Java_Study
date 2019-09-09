package chapter15.searchtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchTest {

	public static void main(String[] args) {
		//1.arraylist integer ����
		List<Integer> list = new ArrayList<Integer>();
		//2. ���������� 1~100���̸� 100�� �Է��ϼ���
		
		for(int i=0;i<100;i++) {
			
			list.add((int)(Math.random()*(100-1+1)+1));
			System.out.print(" "+list.get(i));
		}
		long start1=System.nanoTime(); //�ܿ���
		for(int i=0;i<100;i++) {
			if(list.get(i)==10) {
				break;
			}
		}
		long stop1=System.nanoTime(); //�ܿ���
		System.out.println("\n"+"�Ϲݹ���˻�ó��="+(stop1-start1));
		//3. ���Ľ�ų��
		System.out.println();
		Collections.sort(list);
		for(Integer i:list) {
			System.out.print(" "+i);
		}
		long start =System.nanoTime();
		int index = Collections.binarySearch(list,10);	 //�� ����� ������
		long stop = System.nanoTime();
		System.out.println("\n"+index+" "+(stop-start));
		
		
	}

}
