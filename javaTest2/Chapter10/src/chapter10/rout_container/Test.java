package chapter10.rout_container;



import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Test extends Application {
	public boolean flag=false;
	
	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		//1.루트 2.컨트롤러
		VBox vbox = new VBox();
		vbox.setPrefHeight(150);
		vbox.setPrefWidth(350);
		vbox.setAlignment(Pos.CENTER);
		vbox.setSpacing(20);
		
		//컨트롤러
		Label label = new Label();
		
		label.setText("Hello JavaFx");
		label.setFont(new Font(50));
		
		Button button = new Button();
		button.setText("확인");
		//button.setOnAction((e)->Platform.exit());
		
		button.setOnAction(new EventHandler<ActionEvent>() { //이벤트
								//여기까지
			@Override
			public void handle(ActionEvent arg0) { //1번방식 2번방식 익명, 람다식
								   //여기
			//이 핸들 함수안에다가 이벤트 발생하는순간 변화시킬 동작들을 적는다.
				if(flag) {
					label.setText("Hello Kim");
					label.setFont(new Font(30));
				}else {
					label.setText("Hello JavaFx");
					label.setFont(new Font(50));
				}
				flag=!flag;
			}
		});
		
		
		ObservableList<Node> obs= vbox.getChildren();
		
		obs.add(label);
		obs.add(button);
		
		Scene scene = new Scene(vbox);
		
		stage.setScene(scene);
		stage.show();
		
		
		
		
		
	}

}
