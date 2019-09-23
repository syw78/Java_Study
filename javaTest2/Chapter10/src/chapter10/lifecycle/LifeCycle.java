package chapter10.lifecycle;

import javafx.application.Application;
import javafx.stage.Stage;
							//생명주기 출력.
public class LifeCycle extends Application {

	public LifeCycle() {
		System.out.println(Thread.currentThread().getName()+" 스레드 생성자함수 ");
	}
	
	
	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName()+" stop함수 스레드");
	}


	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName()+" init함수 스레드");
	}


	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName()+" start함수 스레드");
		//primaryStage.setTitle("자바FX");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
		System.out.println(Thread.currentThread().getName()+" 메인함수 스레드");
	}


}
