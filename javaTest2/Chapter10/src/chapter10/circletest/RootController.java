package chapter10.circletest;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class RootController implements Initializable {
	@FXML private Circle circle;
	@FXML AnchorPane anchorpane;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		circle.centerXProperty().bind(Bindings.divide(anchorpane.widthProperty(), 2 ));
		circle.centerYProperty().bind(Bindings.divide(anchorpane.heightProperty(), 2));
	}

}
