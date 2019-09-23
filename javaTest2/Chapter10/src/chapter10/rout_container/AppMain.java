package chapter10.rout_container;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application {

	public static void main(String[] args) {
		
		launch(args);
		
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		//1.루트 컨테이너와 컨트롤러를 만든다. 여러가지가있다.
		VBox vBox= new VBox();
		vBox.setPrefHeight(150); //세로
		vBox.setPrefWidth(350); //가로
		vBox.setAlignment(Pos.CENTER); //가운데 정렬  
		vBox.setSpacing(30); //여백 공간  
		
		//2.컨트롤러
		Label label = new Label();
		label.setText("Hello JavaFX"); //라벨 확인 출력
		label.setFont(new Font(50));	//폰트 만듬
		
		Button button = new Button(); //버튼 만듬
		button.setText("확인"); //확인이라는 텍스트 출력
		button.setOnAction((e)->Platform.exit()); //이벤트처리
		
		//3.루트컨테이너에 컨트롤러 집어넣는다.
		//옵저버블은 리스트와 똑같이 생각하면 된다.
		//Node는 들어가는 컨트롤러
		
		ObservableList<Node> list = vBox.getChildren();
		list.add(label);
		list.add(button);
		
		//4.루트 컨테이너를 scene에 집어넣는다.
		Scene scene = new Scene(vBox);
		//5.stage에 scene를 집어넣는다.
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
		


}
}