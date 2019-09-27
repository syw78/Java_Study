package chapter10.slider_test;

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
		Parent root=FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		stage.setTitle("â");
		stage.setScene(scene);
		stage.show();
	}
}
