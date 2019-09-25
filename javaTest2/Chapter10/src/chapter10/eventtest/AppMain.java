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
		
		//1.��Ʈ �����̳�.
		//2.��
		//3.��������
		//4.����������
		
		Parent root=FXMLLoader.load(getClass().getResource("root.fxml")); //xml�� �޸𸮿� �ε�ȴ� �׷��鼭 ��ü������ ��ü�� �������. ���ϰ��� ��Ʈ��Ʈ�ѷ� �θ�.
		Scene scene = new Scene(root); //������ �ſ� �ִ´�. 
		primaryStage.setScene(scene); //���� �־��ִ°�,
		primaryStage.setResizable(false); //â������ ����
		primaryStage.setTitle("������ �̺�Ʈó��");
		primaryStage.show();
		
		//1.��Ʈ ��Ʈ�ѷ� Ŭ������ �����. implements Initializable
		//2.
	}
}
