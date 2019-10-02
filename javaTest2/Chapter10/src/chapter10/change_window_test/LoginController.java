package chapter10.change_window_test;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

public class LoginController implements Initializable {
	@FXML private AnchorPane anchorPane;
	@FXML private Button buttonToMain;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		buttonToMain.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				buttonToMainAction(event);
				
			}
		});
	}

	public void buttonToMainAction(ActionEvent event) {
		StackPane stackPane=(StackPane)buttonToMain.getScene().getRoot();
		stackPane.getChildren().remove(anchorPane);
	}
}
