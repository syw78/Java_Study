package chapter10.css_drop_shadow;

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
			
	
		Scene scene = new Scene(hBox);
		//5. scene�� �ܺν�Ÿ���� ����ִ´�.
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		//6.stage�� scene�� ����ִ´�
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("â");
		primaryStage.setResizable(false);
		primaryStage.show();
	
	}
	

	
}
