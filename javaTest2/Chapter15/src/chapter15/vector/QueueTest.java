package chapter15.vector;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) throws InterruptedException {
		Queue<Integer> queue= new LinkedList<Integer>();
		for(int i=10;i>=0;i--) {
			queue.add(new Integer(i));
		}
		while(!queue.isEmpty()) {
			System.out.println(queue.remove()+" ");
			Thread.sleep(1000); //1�ʰ� �����·�
		}
		
	}

}
