package chapter10.property_bind;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class RootController implements Initializable {
	@FXML TextArea textArea1;
	@FXML TextArea textArea2;																		
	@FXML Button btnBind;
	@FXML Button btnUnbind;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {												//���ε� ���� �����ϴ�
		btnBind.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override				
			public void handle(ActionEvent event) {								
				Bindings.bindBidirectional(textArea1.textProperty(), textArea2.textProperty());		//�Ӽ����ÿ� ���ε带 ���������� �ϴ� Ŭ������ �������� �ְ�޴´�
			}
		});
		//textArea2.textProperty().bindBidirectional(textArea1.textProperty());
		//textArea1.setOnKeyReleased(new EventHandler<Event>() {
			btnUnbind.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					Bindings.unbindBidirectional(textArea1.textProperty(), textArea2.textProperty());
				}
			});

			
			
			//@Override
		//	public void handle(Event event) {
//				String data =textArea1.getText();     area1���� area2��
//				textArea2.setText(data);
				
//				int count = textArea1.getLength();
//				String data = textArea1.getText(count-1,count);
//				String targetDate = textArea2.getText();
//				textArea2.setText(targetDate+data);
//				
//				Bindings.bindBidirectional(textArea1.textProperty(), textArea2.textProperty()); // ����?
//			}
//		});
			
			
			
	}

}
