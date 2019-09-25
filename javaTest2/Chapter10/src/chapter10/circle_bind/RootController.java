package chapter10.circle_bind;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class RootController implements Initializable {
	@FXML private AnchorPane ancDivid;
	@FXML private Circle circle;

																		//ÇÁ·ÎÆÞÆ¼¶õ ?
	@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
//		circle.setCenterX(ancDivid.getWidth()/2);
//		circle.setCenterY(ancDivid.getHeight()/2);
//		circle.centerXProperty().bind(Bindings.divide(ancDivid.widthProperty(), 2));
//		circle.centerYProperty().bind(Bindings.divide(ancDivid.heightProperty(), 2));
		
			ancDivid.widthProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				circle.setCenterX(newValue.doubleValue()/2);
			}
		});
		
		ancDivid.heightProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				circle.setCenterY(newValue.doubleValue()/2);
			}
		});
		
	}
}