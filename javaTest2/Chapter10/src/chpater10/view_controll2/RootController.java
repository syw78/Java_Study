package chpater10.view_controll2;

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
	// 1. 변수선언 (리스트뷰, 테이블뷰, 이미지뷰)
	@FXML private ListView<String> listView;
	@FXML private TableView<Phone> tableView;
	@FXML private ImageView imageView;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// 1. 리스트뷰를 항목을 삽입하고 프로퍼티 이벤트처리한다.
		insertListViewItemAndEventProcess();
		// 2. 테이블뷰를 항목을 삽입하고 테이블컬럼 연결하고, 프로퍼티 이벤트처리한다.
		insertTableViewItemAndEventProcess();

	} // end initialize

	private void insertTableViewItemAndEventProcess() {
		// 1. ObservableList<Phone> tableViewData 객체를 구한다.
		ObservableList<Phone>tableViewData = FXCollections.observableArrayList();
		// 2. tableViewData에(테이블뷰) new Phone("S1","phone01.png") 추가한다
		tableViewData.add(new Phone("갤럭시S1", "phone01.png"));
		tableViewData.add(new Phone("갤럭시S2", "phone02.png"));
		tableViewData.add(new Phone("갤럭시S3", "phone03.png"));
		tableViewData.add(new Phone("갤럭시S4", "phone04.png"));
		tableViewData.add(new Phone("갤럭시S5", "phone05.png"));
		tableViewData.add(new Phone("갤럭시S6", "phone06.png"));
		tableViewData.add(new Phone("갤럭시S7", "phone07.png"));
		// 3. 각 테이블컬럼과 Phone클래스 멤버이름과 연결한다.
		TableColumn tcSmartPhone = tableView.getColumns().get(0);
		tcSmartPhone.setCellValueFactory(new PropertyValueFactory("smartPhone"));
		tcSmartPhone.setStyle("-fx-aligment: CENTER;");
		
		TableColumn tcImage = tableView.getColumns().get(1);
		tcImage.setCellValueFactory(new PropertyValueFactory("image"));
		tcImage.setStyle("-fx-aligment: CENTER;");
		// TableColumn tcSmartPhone=tableView.getColumns().get(0);
		// tcSmartPhone.setCellValueFactory(new PropertyValueFactory("smartPhone"));
		// 4. 테이블뷰에 tableViewData를 추가한다.
		tableView.setItems(tableViewData);
		// 5. 테이블뷰에 이벤트처리한다. (힌트: getSelectionModel())
		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Phone>() {

			@Override
			public void changed(ObservableValue<? extends Phone> observable, Phone oldValue, Phone newValue) {
				// 5.1 선택된 phone객체에서 getImage 이름을 가져와서 imageView에 적용시킨다.
				Image imageData=new Image(getClass().getResource("images/"+newValue.getImage()).toString());
				imageView.setImage(imageData);
			}
		});
	}
	private void insertListViewItemAndEventProcess() {
		// 1. ObservableList<String> listViewData 객체를 구한다.
		ObservableList<String> list=FXCollections.observableArrayList();
		// 2. listViewData에(리스트뷰) 갤럭시S1 ~ 갤럭시S7 추가한다
		list.add("갤럭시S1");
		list.add("갤럭시S2");
		list.add("갤럭시S3");
		list.add("갤럭시S4");
		list.add("갤럭시S5");
		list.add("갤럭시S6");
		list.add("갤럭시S7");
		// 3. 리스트뷰에 listViewData를 추가한다.
		listView.setItems(list);
		// 4. 리스트뷰에 이벤트처리한다. (힌트: getSelectionModel())
		listView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// 4.1 테이블뷰 위치를 부여한다. 선택한다.
				int number =newValue.intValue();
				tableView.getSelectionModel().select(number);
				// 4.2 테이블뷰 scrollTo(위치)선택한다.
				tableView.scrollTo(number);
			}
		});
	}
	public void handlerButtonOKAction(ActionEvent e) {
		// 1. 선택된 리스트뷰를 가져와서. getSelectionModel() 출력한다.
		String data=listView.getSelectionModel().getSelectedItem();
		System.out.println(data);
		// 2. 선택된 테이블뷰를 가져와서 getSelectionModel() 출력한다.
		Phone phone=tableView.getSelectionModel().getSelectedItem();
		System.out.println(phone.toString());
	}

	public void handlerButtonExitAction(ActionEvent e) {
	      //1. 현재창을 닫는다. 
		Platform.exit();
	   }
}