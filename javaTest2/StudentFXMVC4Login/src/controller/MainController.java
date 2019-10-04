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
		alertDisplay(5,"��������","��������",txtName.getText()+"�� �ݰ����ϴ�");		
		
	}
	public void handlerDeleteAction(ActionEvent e1) {
		alertDisplay(5,"����","����",txtName.getText()+"�� �����߽��ϴ�");
	}

	public void handlerEndAction(ActionEvent e2) {
		alertDisplay(5,"����","����",txtName.getText()+"�� �ȳ�");
	}
	
	public void handlerOkAction(ActionEvent e3) {
		alertDisplay(5,"Ȯ��","Ȯ��",txtName.getText()+"�� Ȯ���߽��ϴ�");
	}
	
	private void alertDisplay(int type, String title, String headerText, String contentText) {
		Alert alert= null;  //���â�� �ִ°�,CONFIRMATION�� Ȯ�� ���� �ϰڽ��ϱ�? , �������̼��� ����
		switch(type) {
		case 1 : 
		alert= new Alert(AlertType.WARNING); //���â�� �ִ°�,CONFIRMATION�� Ȯ�� ���� �ϰڽ��ϱ�? , �������̼��� ����
		//�����ִ°�
		//1.���̵�� �н����尡 �ùٸ��� �Է������� ���â�� �ش�.
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
		alert.showAndWait(); //�����ִ°�
	}
}
