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
	private String string="5반";
	
	//1.스테이지를 참조할떄는 절대로 initialize에서 하면안된다(왜? 스테이지없다.)
	//그럼 어디서 하냐 ? initialize를 뺀 나머지 핸들러함수에서 참조해라. 왜? 거기엔 있으니까.스테이지가.
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		 	
	}// end of initialize
	
	//파일열기다이얼로그창 활성화 하기.
	public void handleOpenFileChooser() {
		//1.파일 추저를 부른다.(스테이지,씬,루트 이미 구성되어있다.)
		FileChooser fileChooser =new FileChooser();
		//2.fileChooser에 확장자 기능을 부여할수 있다.
		fileChooser.getExtensionFilters().addAll(
				new ExtensionFilter("텍스트파일","*.txt"),
				new ExtensionFilter("이미지파일","*.png","*.jpg","*.gif"),
				new ExtensionFilter("한글파일","*.hwp"),
				new ExtensionFilter("모든파일","*")
				
				);
		//2.메인 스테이지를 할당해야된다.(파일추저 스테이지에 할당해야한다.)
		File file =fileChooser.showOpenDialog(primaryStage);
		if(file!= null) {
			System.out.println(file.getPath()); //파일경로 가져오기
		}

	}
	//파일저장다이얼로그창 활성화하기
	public void handleSaveFileChooser() {
		//1.파일 추저를 부른다.(스테이지,씬,루트 이미 구성되어있다.)
		FileChooser fileChooser =new FileChooser();
		fileChooser.getExtensionFilters().addAll(
				new ExtensionFilter("텍스트파일","*.txt"),
				new ExtensionFilter("이미지파일","*.png","*.jpg","*.gif"),
				new ExtensionFilter("한글파일","*.hwp"),
				new ExtensionFilter("모든파일","*")
				//2.주인스테이지를 할당해야된다.(파일추저스테이지할당.)
				);
		Stage stage = (Stage)hBox.getScene().getWindow();
		File file =fileChooser.showSaveDialog(primaryStage);
		if(file!= null) {
			System.out.println(file.getPath()); //파일경로 가져오기
		}
	}
	//디렉토리 정보를 가져오는 다이얼로그창 불러오기
	public void handleDirectoryFileChooser() {
		DirectoryChooser direc= new DirectoryChooser();
		File file = direc.showDialog(primaryStage);
		if(file!= null) {
			System.out.println(file.getPath()); //파일경로 가져오기
		}
	}
	//팝업창을 불러서 가져오기
	public void handlePopUpFileChooser(){
		Popup popup=new Popup(); //얘는 스테이지는 있는데 루트컨테이너가 없다.
		HBox hbox=null;
		//popup.fxml 루트커테이너 만들었으니까 가져와야 되지 않을까요..
		try {
			hbox = FXMLLoader.load(getClass().getResource("popup.fxml"));
			//UI객체를 찾아서 저장시키는방법
			ImageView imageView =(ImageView)hbox.lookup("#imageView");
			Label label =(Label)hbox.lookup("#label");
			label.setText(string);
			imageView.setOnMouseClicked(new EventHandler<Event>() {

				@Override
				public void handle(Event event) {
					popup.hide();
				}
			});
			popup.getContent().add(hbox);//씬에 루트컨테이너를 넣는다.
			popup.show(this.hBox.getScene().getWindow());
			popup.setAutoHide(true);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
																																		//init 초기값 설정할때 ? 처음값
	//사용자 정의하기 창 가져오기
	public void handleCustomFileChooser() throws IOException {
		//1.스테이지를 만든다(창 스타일 5개에서 하나를 선택한다.)
		Stage stage =new Stage(StageStyle.UTILITY);	                    //Stage stage =new Stage(StageStyle.UNIFIED);
		//2.이 창이 모달인지 ,모달리스인지 결정해줘야 한다.(모달창을 만든다.)
		stage.initModality(Modality.WINDOW_MODAL);   					//stage.initModality(Modality.WINDOW_MODAL);
		//3.너의 주인 스테이지 누구랴를 셋팅한다.
		stage.initOwner(hBox.getScene().getWindow()); 	
		//4.타이틀을 정한다.
		stage.setTitle("서연우의 서브창"); stage.setTitle("창"); 
		stage.setResizable(false);		
		//stage.show();
		//5.루트 컨테이너를 가져온다
		AnchorPane acP =FXMLLoader.load(getClass().getResource("custom_dialog.fxml"));   
		//6. UI객체를 찾고 이벤트를 걸고 처리방식까지 정의한다.
		TextField textFieldKor=(TextField)acP.lookup("#textFieldKor"); 		
		TextField textFieldEng=(TextField)acP.lookup("#textFieldEng");
		TextField textFiledMus=(TextField)acP.lookup("#textFiledMus");
		
		Button buttonOK=(Button)acP.lookup("#buttonOK");
		Button buttonClear=(Button)acP.lookup("#buttonClear");
		//7.이벤트처리한다
		buttonOK.setOnAction((event)-> {
				int sum =Integer.parseInt(textFieldKor.getText())+
				Integer.parseInt(textFieldEng.getText())+
				Integer.parseInt(textFiledMus.getText());		
				System.out.println("합계는 =" + sum);
				
		});
		
		buttonClear.setOnAction((event)-> {
				textFieldKor.setText("0");
				textFieldEng.setText("0");
				textFiledMus.setText("0");
		});
		//8.씬에 적용시킨다.
		Scene scene = new Scene(acP);
		stage.setScene(scene);
		stage.show();
	}
	
	public void handleCustomFileChooserSeo() throws IOException{
		Stage stage = new Stage(StageStyle.UTILITY);
		stage.initModality(Modality.WINDOW_MODAL);
		stage.initOwner(hBox.getScene().getWindow());
		stage.setTitle("연우 창");
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














