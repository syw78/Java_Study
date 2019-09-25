package chapter10.textarea_test;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;

public class RootController implements Initializable {
	@FXML private TextArea textArea1;
	@FXML private TextArea textArea2;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
		textArea2.textProperty().bindBidirectional(textArea1.textProperty()); //양쪽이 바뀌도록하겠다.
		
	}
}
