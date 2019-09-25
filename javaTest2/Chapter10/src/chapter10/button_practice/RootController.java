package chapter10.button_practice;

import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;




public class RootController implements Initializable {
	@FXML private CheckBox chBGlasses;
	@FXML private CheckBox chBCap;
	@FXML private ImageView chImage ;
	@FXML private RadioButton rdoButton1;
	@FXML private RadioButton rdoButton2;
	@FXML private RadioButton rdoButton3;
	@FXML private ImageView imgChart ;
	
	@Override				
	public void initialize(URL stage, ResourceBundle arg1) {
		
	}
	
	public void handlerExitButtonAction(ActionEvent e ) {
		Platform.exit();
	}
	public void handlerCheckBoxAction(ActionEvent e) {
		if(chBGlasses.isSelected()&&chBCap.isSelected()) {
			chImage.setImage(new Image(getClass().getResource("images/geek-glass-hair.gif").toString()));
		}else if(chBGlasses.isSelected()) {
			chImage.setImage(new Image(getClass().getResource("images/geek-glasses.gif").toString()));
		}else if(chBCap.isSelected()) {
			chImage.setImage(new Image(getClass().getResource("images/geek-hair.gif").toString()));
		}else {
			chImage.setImage(new Image(getClass().getResource("images/geek.gif").toString()));
		}
	}
}
