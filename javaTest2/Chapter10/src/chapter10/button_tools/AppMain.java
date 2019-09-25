package chapter10.button_tools;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
		//1 root container ���� (�ΰ��� : �ڹ����α׷� ,fxml)
		//2. scene ����
		//3.���� �������� ������Ѿߵ�.
		Parent root = null;
		try {
			root=FXMLLoader.load(getClass().getResource("root.fxml"));	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Scene  scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Ȩ������");
		primaryStage.setResizable(true); //â ũ�� ������ ���� �Լ�.
		primaryStage.show();
		
	}

}
