package chapter10.eventtest;

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
	public void start(Stage primaryStage) throws Exception {
		
		//1.루트 컨테이너.
		//2.신
		//3.스테이지
		//4.스테이지쇼
		
		Parent root=FXMLLoader.load(getClass().getResource("root.fxml")); //xml이 메모리에 로드된다 그러면서 자체적으로 객체가 만들어짐. 다하고나서 루트컨트롤러 부름.
		Scene scene = new Scene(root); //루컨을 신에 넣는다. 
		primaryStage.setScene(scene); //신을 넣어주는것,
		primaryStage.setResizable(false); //창사이즈 고정
		primaryStage.setTitle("서연우 이벤트처리");
		primaryStage.show();
		
		//1.루트 컨트롤러 클래스를 만든다. implements Initializable
		//2.
	}
}
