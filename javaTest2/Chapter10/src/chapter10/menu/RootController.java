package chapter10.menu;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;




public class RootController implements Initializable {
	@FXML private TextArea textArea;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
		
	}//end of initialize
	
	public void hadlerMenuItemNewAction() {
		textArea.appendText("���θ���� \n");
	};
	public void hadlerMenuItemOpenAction() {
		textArea.appendText("���� \n");
	};
	public void handlerMenuItemSave() {
		textArea.appendText("���� \n");
	};
	public void handlerMenuItemExitAction() {
		textArea.appendText("������ \n");
	};
	
}
