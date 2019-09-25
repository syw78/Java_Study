package chapter10.button_tools;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable {
	@FXML private CheckBox chGlasses;
	@FXML private CheckBox chCap;
	@FXML private ImageView chIma;
	@FXML private Separator sepa;
	@FXML private RadioButton rdoBubble;
	@FXML private RadioButton rdoBar;
	@FXML private RadioButton rdoArea;
	@FXML private ImageView imgChart;
	@FXML private Button btnExit;
	

																	
	@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	public void handlerExitButtonAction(ActionEvent e) {
		Platform.exit();
	}
	public void handlerCheckBoxAction(ActionEvent e) {
		if(chGlasses.isSelected() && chCap.isSelected()) {
			chIma.setImage(new Image(getClass().getResource("images/geek-glasses-hair.gif").toString()));  //이미지 가져오는방법.
		}else if(chGlasses.isSelected()) {
			chIma.setImage(new Image(getClass().getResource("images/geek-glasses.gif").toString()));
		}else if(chCap.isSelected()) {
			chIma.setImage(new Image(getClass().getResource("images/geek-hair.gif").toString()));
		}else {
			chIma.setImage(new Image(getClass().getResource("images/geek.gif").toString()));
		}
	}//end of handlerCheckBoxAction
}