package chapter10.slider_bind;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;

public class RootController implements Initializable {
	@FXML private Label lblText;
	@FXML private Slider sldSize;
	private int count = 0;
																				//������Ƽ ���.
	//���������Ƽ �ؽ�Ʈ ������Ƽ ���� ��� ����
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		sldSize.valueProperty().addListener(new ChangeListener<Number>() { //�����̵� ����� ���� �ٲ�� ������ ���� �� ���� ����ٰ� �ٲ�� �̺�Ʈ�� ó���ض�.

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) { 
				
				lblText.setFont(new Font(newValue.doubleValue())); //��Ʈ ũ�� ���� ������� ������������� �� ����� �Ҽ����� �����ϱ� int�� �ϸ� ������̴� 
				count++;
				System.out.println(count+" ");
			}
		});    
	}

}
