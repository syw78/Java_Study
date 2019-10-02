package chapter10.css_textfield;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RootController implements Initializable   {

	
	//1.스테이지를 참조할떄는 절대로 initialize에서 하면안된다(왜? 스테이지없다.)
	//그럼 어디서 하냐 ? initialize를 뺀 나머지 핸들러함수에서 참조해라. 왜? 거기엔 있으니까.스테이지가.
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		 	
	}// end of initialize
	

}














