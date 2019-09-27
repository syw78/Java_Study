package chapter10.view_controll;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable {
	@FXML private ListView<String> listView;
	@FXML private TableView<Phone> tableView;
	@FXML private ImageView imageView;
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//1.리스트뷰를 항목을 삽입하고 프로퍼티 이벤트를 처리한다.
		insertListViewItemAndEventProcess();
		//2.테이블뷰를 항목을 삽입하고 테이블컬럼연결하고 , 프로퍼티 이벤트를 처리한다.
		insertTableViewItemAndEventProcess();
		
		
	}//end of initialize
	private void insertTableViewItemAndEventProcess() {
		ObservableList<Phone>tableViewData=FXCollections.observableArrayList();
		tableViewData.add(new Phone("갤럭시S1", "phone01.png"));
		tableViewData.add(new Phone("갤럭시S2", "phone02.png"));
		tableViewData.add(new Phone("갤럭시S3", "phone03.png"));
		tableViewData.add(new Phone("갤럭시S4", "phone04.png"));
		tableViewData.add(new Phone("갤럭시S5", "phone05.png"));
		tableViewData.add(new Phone("갤럭시S6", "phone06.png"));
		tableViewData.add(new Phone("갤럭시S7", "phone07.png"));
		
		TableColumn tcSmartPhone=tableView.getColumns().get(0);  //0은 스마트폰
		tcSmartPhone.setCellValueFactory(new PropertyValueFactory("smartPhone")); //이름을 그대로 써줘야한다.
		tcSmartPhone.setStyle("-fx-alignment: CENTER");
		
		
		TableColumn tcImage=tableView.getColumns().get(1); //1은 이미지
		tcImage.setCellValueFactory(new PropertyValueFactory("image")); //이름을 그대로 써줘야한다.
		tcImage.setStyle("-fx-alignment: CENTER");
		
		tableView.setItems(tableViewData);
		//니가선택한 그객체에 정보를 주는데 (아이템프로퍼티는 객체가변한걸 주고 인덱스는 인덱스 위치가 변한걸준다) 감시하겠다
		//애드 리스너 : 듣고있을게 변화하면 나한테정보를 줘라 들어오는건 객체이다 
		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Phone>() {

			@Override
			public void changed(ObservableValue<? extends Phone> observable, Phone oldValue, Phone phone) {
				Image imageData=new Image(getClass().getResource("images/"+phone.getImage()).toString());
				imageView.setImage(imageData);
			}
		});
		
	}
	private void insertListViewItemAndEventProcess() {
		ObservableList<String> listViewData =FXCollections.observableArrayList();
		listViewData.add("갤럭시S1");
		listViewData.add("갤럭시S2");
		listViewData.add("갤럭시S3");
		listViewData.add("갤럭시S4");
		listViewData.add("갤럭시S5");
		listViewData.add("갤럭시S6");
		listViewData.add("갤럭시S7");
		listView.setItems(listViewData);
		
		listView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				tableView.getSelectionModel().select(newValue.intValue());
				tableView.scrollTo(newValue.intValue());
			}
		});
		
	}
	public void handlerButtonOkAction(ActionEvent e) {
		String data=listView.getSelectionModel().getSelectedItem();
		System.out.println("선택된 핸드폰 리스트는 ="+data);
		Phone phone=tableView.getSelectionModel().getSelectedItem();
		System.out.println("선택된 테이블뷰는 ="+phone.toString());
	}
	public void handlerButtonExitAction(ActionEvent e) {
		Platform.exit();
	}
}

