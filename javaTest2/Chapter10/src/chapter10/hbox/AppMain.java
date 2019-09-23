package chapter10.hbox;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		//1.��Ʈ �����̳ʿ� ��Ʈ�ѷ��� �����. �����������ִ�.
				HBox hBox= new HBox();
				hBox.setPrefHeight(150); //����
				hBox.setPrefWidth(350); //����
				hBox.setAlignment(Pos.CENTER); //��� ����  
				hBox.setSpacing(30); //���� ����  
				
				//2.��Ʈ�ѷ�
				TextField textField=new TextField();
				textField.setPrefWidth(200);
				
				Button button = new Button(); //��ư ����
				button.setText("Ȯ��"); //Ȯ���̶�� �ؽ�Ʈ ���
				button.setOnAction((e)->Platform.exit()); //�̺�Ʈó��
				
				//3.��Ʈ�����̳ʿ� ��Ʈ�ѷ� ����ִ´�.
				//�������� ����Ʈ�� �Ȱ��� �����ϸ� �ȴ�.
				//Node�� ���� ��Ʈ�ѷ�
				
				ObservableList<Node> list = hBox.getChildren();
				list.add(textField);
				list.add(button);
				
				//4.��Ʈ �����̳ʸ� scene�� ����ִ´�.
				Scene scene = new Scene(hBox);
				//5.stage�� scene�� ����ִ´�.
				primaryStage.setScene(scene);
				primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
