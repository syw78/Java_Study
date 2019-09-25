package chapter10.circle_test2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;

public class RootController implements Initializable {
	@FXML private AnchorPane ancDivid;
	@FXML private Circle circle;
																			//������Ƽ : ���� 
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		ancDivid.widthProperty().addListener(new ChangeListener<Number>() {

			@Override																					//���� ��			//���ο� ��.
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				circle.setCenterX(newValue.doubleValue()/2); //�̰� ���ͽ�
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
