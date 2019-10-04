package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



public class LoginController implements Initializable {
	@FXML private TextField txtId;
	@FXML private PasswordField txtPassword;
	@FXML private Button btnLogin;
	@FXML private Button btnCancel;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//1. ��ưȮ�� �̺�Ʈ ó��
		btnLogin.setOnAction( e-> { handlerButtonLoginAction(e);});
		//2. ��ư��� �̺�Ʈ ó��
		btnCancel.setOnAction( e-> { handlerButtonCancelAction(e);});
		txtId.setText("admin");
		txtPassword.setText("1234");
	}


	//1. ��ưȮ�� �̺�Ʈ ó��
	public void handlerButtonLoginAction(ActionEvent event) {
		//1.���̵�� �н����尡 �Է��� �ȵǾ����� ���â�� �ش�.
		if(txtId.getText().equals("")||txtPassword.getText().equals("")) {
			alertDisplay(1,"�α��� ����","�������� ���̵�,�н����� ���Է�","�ٽ� ����� �Է��ϼ���");
			
//			Alert alert= new Alert(AlertType.CONFIRMATION);  //���â�� �ִ°�,CONFIRMATION�� Ȯ�� ���� �ϰڽ��ϱ�? , �������̼��� ����
//			alert.setTitle("�α��� ����");
//			alert.setHeaderText("�������� ���̵�,�н����� ���Է�");
//			alert.setContentText("���̵�� ��й�ȣ�߿� ���Է��ϴ� �׸��־�� \n"+"�ٽ� ����� �Է��ϼ���");
//			alert.setResizable(false);
//			alert.showAndWait(); //�����ִ°�
			//1.���̵�� �н����尡 �ùٸ��� �Է������� ���â�� �ش�.
			
			//2.���̵�� �н����尡 ��ġ�Ҷ�
		}else if(txtId.getText().equals("admin") && txtPassword.getText().equals("1234")) {
			//�۾��� ó���Ѵ�.
			System.out.println("������");
			//�α����� �Ϸ�Ǿ����� ���� ����â���� �̵��Ѵ�.
			Parent mainView=null;
			Stage mainStage=null;
			try {
				 	//mainView=FXMLLoader.load(getClass().getResource("/view/main.fxml"));
				 	mainView=FXMLLoader.load(getClass().getResource("/view/view.fxml"));
					Scene scene = new Scene(mainView);
					mainStage=new Stage();
					mainStage.setScene(scene);
					mainStage.setTitle("Main Window");
					mainStage.setResizable(true);
					//������ ���������� �ݰ� ���ο�â�� ����.
					((Stage)btnCancel.getScene().getWindow()).close();
					mainStage.show();
					
			} catch (IOException e) {
				System.out.println("����â �θ��� ����"+e);
				alertDisplay(1,"����â �ݽ���","����â �θ��� ����",e.toString());
			}
		
			//3.���̵�� �н����尡 ��ġ���� �ʾ����� ���â�� �ش�.
		}else {
			
			alertDisplay(1,"�α��� ����","�������� ���̵�,�н����� ����ġ","�ٽ� ����� �Է��ϼ���");
//			Alert alert= new Alert(AlertType.WARNING);  //���â�� �ִ°�,CONFIRMATION�� Ȯ�� ���� �ϰڽ��ϱ�? , �������̼��� ����
//			alert.setTitle("�α��� ����");
//			alert.setHeaderText("�������� ���̵�,�н����� ����ġ");
//			alert.setContentText("���̵�� ��й�ȣ�� ����ġ�մϴ�. \n"+"�ٽ� ����� �Է��ϼ���");
//			alert.setResizable(false);
//			alert.showAndWait(); //�����ִ°�
		}
		
	}

	//2. ��ư��� �̺�Ʈ ó��
	private void handlerButtonCancelAction(ActionEvent e) {
		((Stage)btnCancel.getScene().getWindow()).close();
//		Stage stage = (Stage) btnCancel.getScene().getWindow();
//		stage.close();  �̰Ÿ� �ѹ������� ���ΰ��̴�.
	}
	//3.���â ó���ϴ� �Լ�
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
