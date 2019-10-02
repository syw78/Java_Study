package chapter10.change_window_test;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

public class ScoreController implements Initializable {
	@FXML private AnchorPane ancP;
	@FXML private TextField textKor;
	@FXML private TextField textEn;
	@FXML private TextField textMa;
	@FXML private TextField textTo;
	@FXML private	TextField textEV;
	@FXML private	 Button buttonMA;
	@FXML private	Button buttonT;
	@FXML private	Button buttonE;
	@FXML private	Button buttonCL;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		buttonT.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				int sum= Integer.parseInt(textKor.getText())+Integer.parseInt(textEn.getText())+Integer.parseInt(textMa.getText());
				textTo.setText(String.valueOf(sum));				
			}
		});
		buttonE.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				int sum= Integer.parseInt(textKor.getText())+Integer.parseInt(textEn.getText())+Integer.parseInt(textMa.getText());
				int ever = sum/3;
				textEV.setText(String.valueOf(ever));
			}
		});
		buttonCL.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				textKor.setText(null);
				textEn.setText(null);
				textMa.setText(null);
				textTo.setText(null);
				textEV.setText(null);
			}
		});
		buttonMA.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				buttonMAAction(event);
			}
		});
	}
	public void buttonMAAction(ActionEvent event) {
		StackPane stackPane =(StackPane)buttonMA.getScene().getRoot();
		stackPane.getChildren().remove(ancP);
	}

}
