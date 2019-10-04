package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class MainController implements Initializable {
	@FXML private TextField txtName;
	@FXML private Button btnInsert;
	@FXML private Button btnDelete;
	@FXML private Button btnEnd;
	@FXML private Button btnOk;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnInsert.setOnAction( e-> { handlerInsertAction(e);});
		btnDelete.setOnAction( e1-> { handlerDeleteAction(e1);});
		btnEnd.setOnAction( e2-> { handlerEndAction(e2);});
		btnOk.setOnAction( e3-> { handlerOkAction(e3);});
	}
	public void handlerInsertAction(ActionEvent e) {
		alertDisplay(5,"삽입정보","삽입정보",txtName.getText()+"님 반갑습니다");		
		
	}
	public void handlerDeleteAction(ActionEvent e1) {
		alertDisplay(5,"삭제","삭제",txtName.getText()+"님 제거했습니다");
	}

	public void handlerEndAction(ActionEvent e2) {
		alertDisplay(5,"종료","종료",txtName.getText()+"님 안녕");
	}
	
	public void handlerOkAction(ActionEvent e3) {
		alertDisplay(5,"확인","확인",txtName.getText()+"님 확인했습니다");
	}
	
	private void alertDisplay(int type, String title, String headerText, String contentText) {
		Alert alert= null;  //경고창을 주는것,CONFIRMATION은 확증 뭐뭐 하겠습니까? , 인포메이션은 정보
		switch(type) {
		case 1 : 
		alert= new Alert(AlertType.WARNING); //경고창을 주는것,CONFIRMATION은 확증 뭐뭐 하겠습니까? , 인포메이션은 정보
		//보여주는것
		//1.아이디와 패스워드가 올바르게 입력했을때 경고창을 준다.
		break;
		case 2 : alert= new Alert(AlertType.CONFIRMATION);break;
		case 3 : alert= new Alert(AlertType.ERROR);break;
		case 4 : alert= new Alert(AlertType.NONE);break;
		case 5 : alert= new Alert(AlertType.INFORMATION);break;
		}
		alert.setTitle(title);
		alert.setHeaderText(headerText); //
		alert.setContentText(headerText+"\n"+contentText);
		alert.setResizable(false);
		alert.showAndWait(); //보여주는것
	}
}
