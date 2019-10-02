package chapter10.change_window_test;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;


public class RootController implements Initializable {
	@FXML private StackPane stackPane;
	@FXML private Button buttonScore;
	@FXML private Button buttonLogin;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		buttonScore.setOnAction((e) -> {
			buttonScoreAction(e);
		});
		
		buttonLogin.setOnAction((e1) -> {
			buttonLoginAction(e1);
		});
		
	}// end of initialize

	public void buttonLoginAction(ActionEvent e1) {
		stackPane=(StackPane) buttonLogin.getScene().getRoot();
		AnchorPane anP=null;
		try {
			anP=FXMLLoader.load(getClass().getResource("login.fxml"));
			stackPane.getChildren().add(anP);
		} catch (IOException e5) {
			// TODO Auto-generated catch block
			e5.printStackTrace();
		}
	}

	public void buttonScoreAction(ActionEvent e) {
		stackPane=(StackPane) buttonScore.getScene().getRoot();
		AnchorPane anP=null;
		try {
			anP=FXMLLoader.load(getClass().getResource("score.fxml"));
			stackPane.getChildren().add(anP);
		} catch (IOException e3) {
			e3.printStackTrace();
		}
	}

}
