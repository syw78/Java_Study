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
	
		// root = FXMLLoader.load(getClass().getResource("root.fxml"));//1.root.fxml(클래스)와 RootController를 로더해서 UI객체와 루트컨틀로러 객체를 만든다.(힙영역)
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("root.fxml"));
			Parent hBox = fxmlLoader.load();
			RootController rootController =fxmlLoader.getController();
			rootController.primaryStage= primaryStage;
			//primaryEHStage = primaryStage;
			//1. root.fxml(클래스)와 RootController를 로더해서 UI객체와 RootController객체를 만든다(힙영역)
			//2. RootController에 있는 @FXML있는 멤버변수에 UI객체를 연결한다.
			//3. initalize함수에서 UI객체에 이벤트정의 및 처리, 속성감시 이벤트정의및 처리한다.
			//4. UI객체중에 최종컨테이너 객체를 리턴한다.
			
		Scene scene = new Scene(hBox);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("창");
		primaryStage.setResizable(false);
		primaryStage.show();
	
	}
	

	
}
