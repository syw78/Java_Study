package chapter10.circle_test2;

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
		Parent root =FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		stage.setScene(scene);
		stage.setTitle("슬라이더 창");
		stage.setResizable(true);
		stage.show();
	}
}
