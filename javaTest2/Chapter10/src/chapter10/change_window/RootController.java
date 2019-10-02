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

	//�α��� ȭ���� �����ִ� �̺�Ʈ ó���Լ�.
	public void handleButtonLoginAction(ActionEvent event)  {
		//1.root.fxml�� ���� �ֻ����� �ִ� ��Ʈ �����̳ʰ�ü���� �����´�.(StackPane��ü)
		StackPane stackP =null;
		AnchorPane ancP=null;
		try {
			stackP =(StackPane)buttonLogin.getScene().getRoot();     //��ٷ�Ʈ�ϸ� �ֻ��� �����̳ʸ� �����´�
			//login.fxml �δ�(login.fxml�� ��� ��üȭ��Ű�� LoginController���� ��üȭ��Ű�� ,
			//��ġ��Ű�� �̺�Ʈ ó�� �� ���ε� �Ӽ� ó���Ѵ�.)�ϰ� �ֻ����� �ִ� ��Ʈ �����̳ʰ�ü���� �ش�.
			ancP=FXMLLoader.load(getClass().getResource("login.fxml"));
			//���� �������ο� �ٸ�ȭ�鿡�ִ� ��Ŀ������ ����ִ´�.
			stackP.getChildren().add(ancP);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}














