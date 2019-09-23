package chapter10.javafx_main;



import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javafx.application.Application;
import javafx.stage.Stage;

//ù��°�δ� ���̺귯���� �߰��Ѵ�!
public class AppMain extends Application { // ���ø����̼��� �߻�ȭ Ŭ����
	//1������ ���Լ�. ������� �ʱ�ȭ��Ű�µ� �����ϱ� ���ص���
	public AppMain() { // �⺻ �����ڸ��θ���. ��������? ��ġ�� �������ִ� ��Ŭ���� ������
		System.out.println(Thread.currentThread().getName() + "������ AppMain()������");
	}
	
	// ���ο��� ��ġ�� �θ��� ���� �⺻������ ,���̳���Ʈ , ��ŸƮ�� �θ���!
	// �̰��� "�����ֱ�" ��� �θ���!

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + "������ main()");
		launch(args); // ���ø����̼� ��ӹ������� ���ο� ��ġ�� �ҷ����Ѵ�! �̷��� �θ��� �Ķ���ͽ� ������ٰ� (args��)���� �صд�.
		// ��ġ �����޼ҵ�.
	}

	//init() ���Լ� 
	@Override
	public void init() throws Exception {
		//System.out.println(Thread.currentThread().getName() + "������ init()");
		//System.out.println("init() ��");
		Parameters ps =getParameters(); //������ ����ִ� 
//		List<String> list=ps.getRaw(); 			����Ʈ�� �������°�.
//		for(String value:list){
//			System.out.print(value);}
		Map<String, String> map= ps.getNamed();
		Set<Entry<String,String>> set =map.entrySet();		//map���� �������¹�
		for(Entry<String,String> entry : set ) {
			String key=entry.getKey();
			String value = entry.getValue();
			System.out.println("key="+key+" value="+value);
		}
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName() + "������ start()");
		primaryStage.setTitle("������ â"); // â �̸� �����ϴ°�. ��Ÿ��Ʋ ���Ǽ���!
		System.out.println("start()�Լ� ����");
		primaryStage.show(); // �轺������ ���� �����̸Ӹ����������� �ٲ۴�
		// �� ���� â�ϳ� ���� ���.

	}
	//� �����尡 ���̳� �ϸ� ���̳���Ʈ������ �ڹٿ���������ó �������� �ڹٿ����������ø����̼� ������
	
	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName() + "������ stop()");
		//��Ʈ�� �����̽��ٷ� stop();�θ�����
		
	}
}
