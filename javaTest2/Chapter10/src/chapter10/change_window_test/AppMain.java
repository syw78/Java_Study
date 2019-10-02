package chapter10.change_window_test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {
	
	//public static Stage primaryEHStage;

		
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent root =FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("â");
		primaryStage.setResizable(false);
		primaryStage.show();
	
	}
	

	
}
