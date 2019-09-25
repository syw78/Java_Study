package chapter10.slidertest;

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
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root); //씬 생성
		stage.setTitle("창"); //창 이름
		stage.setScene(scene); //스테이지에 씬 등록
		stage.show(); // 창 띄우는함수
		stage.setResizable(false); //크기조절
		
	}


}
