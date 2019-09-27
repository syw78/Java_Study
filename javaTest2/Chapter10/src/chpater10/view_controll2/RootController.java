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
	// 1. �������� (����Ʈ��, ���̺��, �̹�����)
	@FXML private ListView<String> listView;
	@FXML private TableView<Phone> tableView;
	@FXML private ImageView imageView;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// 1. ����Ʈ�並 �׸��� �����ϰ� ������Ƽ �̺�Ʈó���Ѵ�.
		insertListViewItemAndEventProcess();
		// 2. ���̺�並 �׸��� �����ϰ� ���̺��÷� �����ϰ�, ������Ƽ �̺�Ʈó���Ѵ�.
		insertTableViewItemAndEventProcess();

	} // end initialize

	private void insertTableViewItemAndEventProcess() {
		// 1. ObservableList<Phone> tableViewData ��ü�� ���Ѵ�.
		ObservableList<Phone>tableViewData = FXCollections.observableArrayList();
		// 2. tableViewData��(���̺��) new Phone("S1","phone01.png") �߰��Ѵ�
		tableViewData.add(new Phone("������S1", "phone01.png"));
		tableViewData.add(new Phone("������S2", "phone02.png"));
		tableViewData.add(new Phone("������S3", "phone03.png"));
		tableViewData.add(new Phone("������S4", "phone04.png"));
		tableViewData.add(new Phone("������S5", "phone05.png"));
		tableViewData.add(new Phone("������S6", "phone06.png"));
		tableViewData.add(new Phone("������S7", "phone07.png"));
		// 3. �� ���̺��÷��� PhoneŬ���� ����̸��� �����Ѵ�.
		TableColumn tcSmartPhone = tableView.getColumns().get(0);
		tcSmartPhone.setCellValueFactory(new PropertyValueFactory("smartPhone"));
		tcSmartPhone.setStyle("-fx-aligment: CENTER;");
		
		TableColumn tcImage = tableView.getColumns().get(1);
		tcImage.setCellValueFactory(new PropertyValueFactory("image"));
		tcImage.setStyle("-fx-aligment: CENTER;");
		// TableColumn tcSmartPhone=tableView.getColumns().get(0);
		// tcSmartPhone.setCellValueFactory(new PropertyValueFactory("smartPhone"));
		// 4. ���̺�信 tableViewData�� �߰��Ѵ�.
		tableView.setItems(tableViewData);
		// 5. ���̺�信 �̺�Ʈó���Ѵ�. (��Ʈ: getSelectionModel())
		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Phone>() {

			@Override
			public void changed(ObservableValue<? extends Phone> observable, Phone oldValue, Phone newValue) {
				// 5.1 ���õ� phone��ü���� getImage �̸��� �����ͼ� imageView�� �����Ų��.
				Image imageData=new Image(getClass().getResource("images/"+newValue.getImage()).toString());
				imageView.setImage(imageData);
			}
		});
	}
	private void insertListViewItemAndEventProcess() {
		// 1. ObservableList<String> listViewData ��ü�� ���Ѵ�.
		ObservableList<String> list=FXCollections.observableArrayList();
		// 2. listViewData��(����Ʈ��) ������S1 ~ ������S7 �߰��Ѵ�
		list.add("������S1");
		list.add("������S2");
		list.add("������S3");
		list.add("������S4");
		list.add("������S5");
		list.add("������S6");
		list.add("������S7");
		// 3. ����Ʈ�信 listViewData�� �߰��Ѵ�.
		listView.setItems(list);
		// 4. ����Ʈ�信 �̺�Ʈó���Ѵ�. (��Ʈ: getSelectionModel())
		listView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// 4.1 ���̺�� ��ġ�� �ο��Ѵ�. �����Ѵ�.
				int number =newValue.intValue();
				tableView.getSelectionModel().select(number);
				// 4.2 ���̺�� scrollTo(��ġ)�����Ѵ�.
				tableView.scrollTo(number);
			}
		});
	}
	public void handlerButtonOKAction(ActionEvent e) {
		// 1. ���õ� ����Ʈ�並 �����ͼ�. getSelectionModel() ����Ѵ�.
		String data=listView.getSelectionModel().getSelectedItem();
		System.out.println(data);
		// 2. ���õ� ���̺�並 �����ͼ� getSelectionModel() ����Ѵ�.
		Phone phone=tableView.getSelectionModel().getSelectedItem();
		System.out.println(phone.toString());
	}

	public void handlerButtonExitAction(ActionEvent e) {
	      //1. ����â�� �ݴ´�. 
		Platform.exit();
	   }
}