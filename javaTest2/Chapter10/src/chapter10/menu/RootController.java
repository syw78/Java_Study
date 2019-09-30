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
		textArea.appendText("새로만들기 \n");
	};
	public void hadlerMenuItemOpenAction() {
		textArea.appendText("열기 \n");
	};
	public void handlerMenuItemSave() {
		textArea.appendText("저장 \n");
	};
	public void handlerMenuItemExitAction() {
		textArea.appendText("끝내기 \n");
	};
	
}
