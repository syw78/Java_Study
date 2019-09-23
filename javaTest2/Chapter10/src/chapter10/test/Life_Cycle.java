package chapter10.test;

import javafx.application.Application;
import javafx.stage.Stage;

public class Life_Cycle extends Application {

	
	
	public Life_Cycle() {
		System.out.println(Thread.currentThread().getName()+" 생성자 함수 스레드");
	}
	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName()+" init() 스레드");
		
	}

	public static void main(String[] args) {
		launch(args);
		System.out.println(Thread.currentThread().getName()+" main()스레드");
	}		

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName()+" start()스레드");
		primaryStage.show();
	}

	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName()+" stop()스레드");
		
	}

}
