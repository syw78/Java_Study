package chapter10.input_controll;

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
	public void start(Stage stage)  {
		Parent root=null;
		try {
		 root = FXMLLoader.load(getClass().getResource("root.fxml")); //겟클래스는 현재위치를 나타내는 느낌 겟리소스는 유알엘의 함수인데 아웃풋인풋처럼 주고받는 역할을한다.
		}catch(Exception e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		
		stage.setScene(scene);
		stage.setTitle("창");
		stage.setResizable(false);
		stage.show();
		
	}
}
