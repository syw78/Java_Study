package chapter10.test;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Container_Box extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		VBox vbox = new VBox();
		vbox.setPrefHeight(100);
		vbox.setPrefWidth(300);
		vbox.setAlignment(Pos.CENTER);
		vbox.setSpacing(20);
		
		Label label = new Label();
		label.setText("Èå¾î¾Æ..");
		label.setFont(new Font(50));
		
		Button button = new Button();
		
		button.setText("È®ÀÎ");
		button.setOnAction((e)->Platform.exit());
		
		ObservableList<Node> obs = vbox.getChildren();
		
		obs.add(label);
		obs.add(button);
		
		Scene scene = new Scene(vbox);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
