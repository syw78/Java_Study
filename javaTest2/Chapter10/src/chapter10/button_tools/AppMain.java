package chapter10.button_tools;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
		//1 root container 만듬 (두가지 : 자바프로그램 ,fxml)
		//2. scene 만듬
		//3.신을 스테이지 적용시켜야됨.
		Parent root = null;
		try {
			root=FXMLLoader.load(getClass().getResource("root.fxml"));	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Scene  scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("홈페이지");
		primaryStage.setResizable(true); //창 크기 조절을 막는 함수.
		primaryStage.show();
		
	}

}
