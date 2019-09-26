package chapter10.input_controll;

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
	public void start(Stage stage)  {
		Parent root=null;
		try {
		 root = FXMLLoader.load(getClass().getResource("root.fxml")); //��Ŭ������ ������ġ�� ��Ÿ���� ���� �ٸ��ҽ��� ���˿��� �Լ��ε� �ƿ�ǲ��ǲó�� �ְ�޴� �������Ѵ�.
		}catch(Exception e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		
		stage.setScene(scene);
		stage.setTitle("â");
		stage.setResizable(false);
		stage.show();
		
	}
}
