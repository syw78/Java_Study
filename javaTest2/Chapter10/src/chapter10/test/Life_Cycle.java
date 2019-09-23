package chapter10.test;

import javafx.application.Application;
import javafx.stage.Stage;

public class Life_Cycle extends Application {

	
	
	public Life_Cycle() {
		System.out.println(Thread.currentThread().getName()+" ������ �Լ� ������");
	}
	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName()+" init() ������");
		
	}

	public static void main(String[] args) {
		launch(args);
		System.out.println(Thread.currentThread().getName()+" main()������");
	}		

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName()+" start()������");
		primaryStage.show();
	}

	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName()+" stop()������");
		
	}

}
