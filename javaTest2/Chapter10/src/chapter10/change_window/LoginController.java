package chapter10.change_window;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

public class LoginController implements Initializable   {
	@FXML private Button buttonMain;
	@FXML private AnchorPane paneAnchor;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
			buttonMain.setOnAction((event)-> {
			handleButtonMainAction(event);
			
		});
	}// end of initialize

	public void handleButtonMainAction(ActionEvent event) {
		StackPane stackPane =  (StackPane)buttonMain.getScene().getRoot(); //최종  컨테이너
		stackPane.getChildren().remove(paneAnchor);
	}

	
}














