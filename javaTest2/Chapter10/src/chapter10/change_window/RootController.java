package chapter10.change_window;

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
import javafx.scene.layout.StackPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RootController implements Initializable   {
	
	@FXML private Button buttonLogin;

	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		buttonLogin.setOnAction((event)-> {
				handleButtonLoginAction(event);
			
		});
	}// end of initialize

	//로그인 화면을 보여주는 이벤트 처리함수.
	public void handleButtonLoginAction(ActionEvent event)  {
		//1.root.fxml에 제일 최상위에 있는 루트 컨테이너객체값을 가져온다.(StackPane객체)
		StackPane stackP =null;
		AnchorPane ancP=null;
		try {
			stackP =(StackPane)buttonLogin.getScene().getRoot();     //얘겟루트하면 최상위 컨테이너를 가져온다
			//login.fxml 로더(login.fxml을 모두 객체화시키고 LoginController까지 객체화시키고 ,
			//매치시키고 이벤트 처리 및 바인드 속성 처리한다.)하고 최상위에 있는 루트 컨테이너객체값을 준다.
			ancP=FXMLLoader.load(getClass().getResource("login.fxml"));
			//현재 스택패인에 다른화면에있는 앵커패인을 집어넣는다.
			stackP.getChildren().add(ancP);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}














