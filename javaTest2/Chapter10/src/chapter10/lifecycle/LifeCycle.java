package chapter10.lifecycle;

import javafx.application.Application;
import javafx.stage.Stage;
							//�����ֱ� ���.
public class LifeCycle extends Application {

	public LifeCycle() {
		System.out.println(Thread.currentThread().getName()+" ������ �������Լ� ");
	}
	
	
	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName()+" stop�Լ� ������");
	}


	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName()+" init�Լ� ������");
	}


	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName()+" start�Լ� ������");
		//primaryStage.setTitle("�ڹ�FX");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
		System.out.println(Thread.currentThread().getName()+" �����Լ� ������");
	}


}
