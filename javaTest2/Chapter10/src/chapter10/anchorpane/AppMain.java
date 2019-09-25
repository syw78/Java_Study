package chapter10.anchorpane;

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
	public void start(Stage primaryStage) throws Exception {
		//1 root container 만듬 (두가지 : 자바프로그램 ,fxml)
		//2. scene 만듬
		//3.신을 스테이지 적용시켜야됨.
		Parent root=FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene  scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("홈페이지");
		primaryStage.setResizable(false); //창 크기 조절을 막는 함수.
		primaryStage.show();
		
	}

}
