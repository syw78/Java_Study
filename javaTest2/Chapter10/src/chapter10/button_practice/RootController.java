package chapter10.button_practice;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;




public class RootController implements Initializable {
	@FXML private CheckBox chBGlasses;
	@FXML private CheckBox chBCap;
	@FXML private ImageView chimage ;
	@FXML private RadioButton rdoButton1;
	@FXML private RadioButton rdoButton2;
	@FXML private RadioButton rdoButton3;
	@FXML private ToggleGroup group;
	@FXML private ImageView imgChart ;
	@FXML private Button btnExit ;
	
	
	@Override				
	public void initialize(URL stage, ResourceBundle arg1) {
//		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
//
//			@Override
//			public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
//				Image image = new Image(getClass().getResource("image/"+newValue.getUserData().toString()+".png").toString());
//				imgChart.setImage(image);	
//			}	
//		});
	}
	
	public void handlerExitButtonAction(ActionEvent e ) {
		Platform.exit();
	}
	public void handlerCheckBoxAction(ActionEvent e) {
		if(chBGlasses.isSelected()&&chBCap.isSelected()) {
			chimage.setImage(new Image(getClass().getResource("image/geek-glasses-hair.gif").toString()));
		}else if(chBGlasses.isSelected()) {
			try {
			chimage.setImage(new Image(getClass().getResource("image/geek-glasses.gif").toString()));
			}catch(Exception e1) {
				e1.printStackTrace();
			}
		}else if(chBCap.isSelected()) {
			chimage.setImage(new Image(getClass().getResource("image/geek-hair.gif").toString()));
		}else {
			chimage.setImage(new Image(getClass().getResource("image/geek.gif").toString()));
		}
	}
	
	public void handlerRadioButtonAction(ActionEvent e) {
		Image image=null;
		if(rdoButton1.isSelected()) {
			image = new Image(getClass().getResource("image/"+rdoButton1.getUserData().toString()+".png").toString());	
		}else if(rdoButton2.isSelected()) {
			image = new Image(getClass().getResource("image/"+rdoButton2.getUserData().toString()+".png").toString());		
		}else{
			image = new Image(getClass().getResource("image/"+rdoButton3.getUserData().toString()+".png").toString());
		}
		imgChart.setImage(image);
	}
}
