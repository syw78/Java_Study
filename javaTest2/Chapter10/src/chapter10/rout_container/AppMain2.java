package chapter10.rout_container;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain2 extends Application {

	public static void main(String[] args) {
		
		launch(args);
		
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		//1.��Ʈ �����̳ʿ� ��Ʈ�ѷ��� �����. �����������ִ�.
		HBox vBox= new HBox();
		vBox.setPrefHeight(100); //����
		vBox.setPrefWidth(375); //����
		vBox.setAlignment(Pos.CENTER); //��� ����  
		vBox.setSpacing(20); //���� ����  
		
		//2.��Ʈ�ѷ�
		Label label = new Label();
		label.setText("Hello JavaFX"); //�� Ȯ�� ���
		label.setFont(new Font(50));	//��Ʈ ����
		
		Button button = new Button(); //��ư ����
		button.setText("Ȯ��"); //Ȯ���̶�� �ؽ�Ʈ ���
		button.setOnAction((e)->Platform.exit()); //�̺�Ʈó��
		
		//3.��Ʈ�����̳ʿ� ��Ʈ�ѷ� ����ִ´�.
		//�������� ����Ʈ�� �Ȱ��� �����ϸ� �ȴ�.
		//Node�� ���� ��Ʈ�ѷ�
		
		ObservableList<Node> list = vBox.getChildren();
		list.add(label);
		list.add(button);
		
		//4.��Ʈ �����̳ʸ� scene�� ����ִ´�.
		Scene scene = new Scene(vBox);
		//5.stage�� scene�� ����ִ´�.
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
		


}
}