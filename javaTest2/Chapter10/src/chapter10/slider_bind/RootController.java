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
																				//프로퍼티 방법.
	//밸류프로퍼티 텍스트 프로퍼티 많이 사용 거의
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		sldSize.valueProperty().addListener(new ChangeListener<Number>() { //슬라이드 사이즈가 값이 바뀌면 리스너 들어라 너 들어라 들었다가 바뀌면 이벤트를 처리해라.

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) { 
				
				lblText.setFont(new Font(newValue.doubleValue())); //폰트 크기 변경 뉴밸류로 더블로한이유는 그 사이즈가 소수점도 있으니까 int로 하면 끊길것이다 
				count++;
				System.out.println(count+" ");
			}
		});    
	}

}
