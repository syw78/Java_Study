package chapter10.dialog;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RootController implements Initializable   {

	public Stage primaryStage;
	@FXML private HBox hBox;
	private String string="5��";
	
	//1.���������� �����ҋ��� ����� initialize���� �ϸ�ȵȴ�(��? ������������.)
	//�׷� ��� �ϳ� ? initialize�� �� ������ �ڵ鷯�Լ����� �����ض�. ��? �ű⿣ �����ϱ�.����������.
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		 	
	}// end of initialize
	
	//���Ͽ�����̾�α�â Ȱ��ȭ �ϱ�.
	public void handleOpenFileChooser() {
		//1.���� ������ �θ���.(��������,��,��Ʈ �̹� �����Ǿ��ִ�.)
		FileChooser fileChooser =new FileChooser();
		//2.fileChooser�� Ȯ���� ����� �ο��Ҽ� �ִ�.
		fileChooser.getExtensionFilters().addAll(
				new ExtensionFilter("�ؽ�Ʈ����","*.txt"),
				new ExtensionFilter("�̹�������","*.png","*.jpg","*.gif"),
				new ExtensionFilter("�ѱ�����","*.hwp"),
				new ExtensionFilter("�������","*")
				
				);
		//2.���� ���������� �Ҵ��ؾߵȴ�.(�������� ���������� �Ҵ��ؾ��Ѵ�.)
		File file =fileChooser.showOpenDialog(primaryStage);
		if(file!= null) {
			System.out.println(file.getPath()); //���ϰ�� ��������
		}

	}
	//����������̾�α�â Ȱ��ȭ�ϱ�
	public void handleSaveFileChooser() {
		//1.���� ������ �θ���.(��������,��,��Ʈ �̹� �����Ǿ��ִ�.)
		FileChooser fileChooser =new FileChooser();
		fileChooser.getExtensionFilters().addAll(
				new ExtensionFilter("�ؽ�Ʈ����","*.txt"),
				new ExtensionFilter("�̹�������","*.png","*.jpg","*.gif"),
				new ExtensionFilter("�ѱ�����","*.hwp"),
				new ExtensionFilter("�������","*")
				//2.���ν��������� �Ҵ��ؾߵȴ�.(�����������������Ҵ�.)
				);
		Stage stage = (Stage)hBox.getScene().getWindow();
		File file =fileChooser.showSaveDialog(primaryStage);
		if(file!= null) {
			System.out.println(file.getPath()); //���ϰ�� ��������
		}
	}
	//���丮 ������ �������� ���̾�α�â �ҷ�����
	public void handleDirectoryFileChooser() {
		DirectoryChooser direc= new DirectoryChooser();
		File file = direc.showDialog(primaryStage);
		if(file!= null) {
			System.out.println(file.getPath()); //���ϰ�� ��������
		}
	}
	//�˾�â�� �ҷ��� ��������
	public void handlePopUpFileChooser(){
		Popup popup=new Popup(); //��� ���������� �ִµ� ��Ʈ�����̳ʰ� ����.
		HBox hbox=null;
		//popup.fxml ��ƮĿ���̳� ��������ϱ� �����;� ���� �������..
		try {
			hbox = FXMLLoader.load(getClass().getResource("popup.fxml"));
			//UI��ü�� ã�Ƽ� �����Ű�¹��
			ImageView imageView =(ImageView)hbox.lookup("#imageView");
			Label label =(Label)hbox.lookup("#label");
			label.setText(string);
			imageView.setOnMouseClicked(new EventHandler<Event>() {

				@Override
				public void handle(Event event) {
					popup.hide();
				}
			});
			popup.getContent().add(hbox);//���� ��Ʈ�����̳ʸ� �ִ´�.
			popup.show(this.hBox.getScene().getWindow());
			popup.setAutoHide(true);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
																																		//init �ʱⰪ �����Ҷ� ? ó����
	//����� �����ϱ� â ��������
	public void handleCustomFileChooser() throws IOException {
		//1.���������� �����(â ��Ÿ�� 5������ �ϳ��� �����Ѵ�.)
		Stage stage =new Stage(StageStyle.UTILITY);	                    //Stage stage =new Stage(StageStyle.UNIFIED);
		//2.�� â�� ������� ,��޸������� ��������� �Ѵ�.(���â�� �����.)
		stage.initModality(Modality.WINDOW_MODAL);   					//stage.initModality(Modality.WINDOW_MODAL);
		//3.���� ���� �������� �������� �����Ѵ�.
		stage.initOwner(hBox.getScene().getWindow()); 	
		//4.Ÿ��Ʋ�� ���Ѵ�.
		stage.setTitle("�������� ����â"); stage.setTitle("â"); 
		stage.setResizable(false);		
		//stage.show();
		//5.��Ʈ �����̳ʸ� �����´�
		AnchorPane acP =FXMLLoader.load(getClass().getResource("custom_dialog.fxml"));   
		//6. UI��ü�� ã�� �̺�Ʈ�� �ɰ� ó����ı��� �����Ѵ�.
		TextField textFieldKor=(TextField)acP.lookup("#textFieldKor"); 		
		TextField textFieldEng=(TextField)acP.lookup("#textFieldEng");
		TextField textFiledMus=(TextField)acP.lookup("#textFiledMus");
		
		Button buttonOK=(Button)acP.lookup("#buttonOK");
		Button buttonClear=(Button)acP.lookup("#buttonClear");
		//7.�̺�Ʈó���Ѵ�
		buttonOK.setOnAction((event)-> {
				int sum =Integer.parseInt(textFieldKor.getText())+
				Integer.parseInt(textFieldEng.getText())+
				Integer.parseInt(textFiledMus.getText());		
				System.out.println("�հ�� =" + sum);
				
		});
		
		buttonClear.setOnAction((event)-> {
				textFieldKor.setText("0");
				textFieldEng.setText("0");
				textFiledMus.setText("0");
		});
		//8.���� �����Ų��.
		Scene scene = new Scene(acP);
		stage.setScene(scene);
		stage.show();
	}
	
	public void handleCustomFileChooserSeo() throws IOException{
		Stage stage = new Stage(StageStyle.UTILITY);
		stage.initModality(Modality.WINDOW_MODAL);
		stage.initOwner(hBox.getScene().getWindow());
		stage.setTitle("���� â");
		stage.setResizable(false);
		AnchorPane acP= FXMLLoader.load(getClass().getResource("custom_test.fxml"));
		TextField txtFK= (TextField)acP.lookup("#txtFK");
		TextField txtFE= (TextField)acP.lookup("#txtFE");
		TextField txtFM= (TextField)acP.lookup("#txtFM");
		TextField txtFT= (TextField)acP.lookup("#txtFT");
		TextField txtFEV= (TextField)acP.lookup("#txtFEV");
		
		Button buttonT=(Button)acP.lookup("#buttonT"); 
		Button buttonE=(Button)acP.lookup("#buttonE"); 
		Button buttonEX=(Button)acP.lookup("#buttonEX");
		
		buttonT.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				int sum= Integer.parseInt(txtFK.getText())+Integer.parseInt(txtFE.getText())+Integer.parseInt(txtFM.getText());
				txtFT.setText(String.valueOf(sum));
			}
		});
		buttonE.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				int sum= Integer.parseInt(txtFK.getText())+Integer.parseInt(txtFE.getText())+Integer.parseInt(txtFM.getText());
				int ever = sum/3;
				txtFEV.setText(String.valueOf(ever));
			}
		});
		Scene scene= new Scene(acP);
		stage.setScene(scene);
		stage.show();
		
	}	
}














