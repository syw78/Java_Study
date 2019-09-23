package chapter10.rout_container;



import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Test extends Application {

	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		//1.루트 2.컨트롤러
		VBox vbox = new VBox();
		vbox.setPrefHeight(150);
		vbox.setPrefWidth(350);
		vbox.setAlignment(Pos.CENTER);
		vbox.setSpacing(20);
		
		//컨트롤러
		Label label = new Label();
		
		label.setText("Hello JavaFx");
		label.setFont(new Font(50));
		
		Button button = new Button();
		button.setText("확인");
		button.setOnAction((e)->Platform.exit());
		
		ObservableList<Node> obs= vbox.getChildren();
		
		obs.add(label);
		obs.add(button);
		
		Scene scene = new Scene(vbox);
		
		stage.setScene(scene);
		stage.show();
		
		
		
		
		
	}

}
