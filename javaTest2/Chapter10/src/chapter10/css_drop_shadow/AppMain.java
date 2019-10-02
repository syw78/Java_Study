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
	
		// root = FXMLLoader.load(getClass().getResource("root.fxml"));//1.root.fxml(클래스)와 RootController를 로더해서 UI객체와 루트컨틀로러 객체를 만든다.(힙영역)
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("root.fxml"));
			Parent hBox = fxmlLoader.load();
			
	
		Scene scene = new Scene(hBox);
		//5. scene에 외부스타일을 집어넣는다.
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		//6.stage에 scene를 집어넣는다
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("창");
		primaryStage.setResizable(false);
		primaryStage.show();
	
	}
	

	
}
