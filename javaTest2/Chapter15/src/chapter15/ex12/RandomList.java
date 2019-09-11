package chapter15.ex12;
import java.util.ArrayList;
import java.util.Iterator;

public class RandomList<T> {
	private ArrayList<T> list;
	public void add(T  item) { 
		//-����Ʈ�� �����ۿ��Ҹ� �޾Ƽ� �߰��Ѵ�.
		list.add(item);
	}
	
	public T getObj(){
	
		//-������ �����ߵǰڱ���(����Ʈ �����ȿ� ������ ��ġ)
		//-����Ʈ���� ���õ� ��ġ���� ������ߵǰڱ���.
		
		return list.get((int)(Math.random()*list.size()));
	}

	public RandomList() {
		super();
		this.list = new ArrayList<T>();
	}	
	public void iterPrint() {
		Iterator<T> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}


