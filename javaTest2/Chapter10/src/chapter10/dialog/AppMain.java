package chapter10.dialog;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {
	
	//public static Stage primaryEHStage;

		
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
	
		// root = FXMLLoader.load(getClass().getResource("root.fxml"));//1.root.fxml(Ŭ����)�� RootController�� �δ��ؼ� UI��ü�� ��Ʈ��Ʋ�η� ��ü�� �����.(������)
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("root.fxml"));
			Parent hBox = fxmlLoader.load();
			RootController rootController =fxmlLoader.getController();
			rootController.primaryStage= primaryStage;
			//primaryEHStage = primaryStage;
			//1. root.fxml(Ŭ����)�� RootController�� �δ��ؼ� UI��ü�� RootController��ü�� �����(������)
			//2. RootController�� �ִ� @FXML�ִ� ��������� UI��ü�� �����Ѵ�.
			//3. initalize�Լ����� UI��ü�� �̺�Ʈ���� �� ó��, �Ӽ����� �̺�Ʈ���ǹ� ó���Ѵ�.
			//4. UI��ü�߿� ���������̳� ��ü�� �����Ѵ�.
			
		Scene scene = new Scene(hBox);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("â");
		primaryStage.setResizable(false);
		primaryStage.show();
	
	}
	

	
}
