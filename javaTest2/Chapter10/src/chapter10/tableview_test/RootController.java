package chapter10.tableview_test;

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
		ObservableList<Phone> tableViewData = FXCollections.observableArrayList();
		// 2. tableViewData��(���̺��) new Phone("S1","phone01.png") �߰��Ѵ�
		tableViewData.add(new Phone("������ S1", "phone01.png"));
		tableViewData.add(new Phone("������ S2", "phone02.png"));
		tableViewData.add(new Phone("������ S3", "phone03.png"));
		tableViewData.add(new Phone("������ S4", "phone04.png"));
		tableViewData.add(new Phone("������ S5" ,"phone05.png"));
		tableViewData.add(new Phone("������ S6", "phone06.png"));
		tableViewData.add(new Phone("������ S7", "phone07.png"));
		// 3. �� ���̺��÷��� PhoneŬ���� ����̸��� �����Ѵ�.
		TableColumn tcSP= tableView.getColumns().get(0);
		tcSP.setCellValueFactory(new PropertyValueFactory("smartPhone"));
		
		TableColumn tcIm= tableView.getColumns().get(1);
		tcIm.setCellValueFactory(new PropertyValueFactory("image"));

		// TableColumn tcSmartPhone=tableView.getColumns().get(0);
		// tcSmartPhone.setCellValueFactory(new PropertyValueFactory("smartPhone"));
		// 4. ���̺�信 tableViewData�� �߰��Ѵ�.
		tableView.setItems(tableViewData);
		
		// 5. ���̺�信 �̺�Ʈó���Ѵ�. (��Ʈ: getSelectionModel())
		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Phone>() {

			@Override
			public void changed(ObservableValue<? extends Phone> observable, Phone oldValue, Phone newValue) {
				Image imageData= new Image(getClass().getResource(newValue.getImage()).toString());
				imageView.setImage(imageData);
			}
		});

		// 5.1 ���õ� phone��ü���� getImage �̸��� �����ͼ� imageView�� ����
		// ��Ų��.
	}

	private void insertListViewItemAndEventProcess() {
		// 1. ObservableList<String> listViewData ��ü�� ���Ѵ�.
		ObservableList<String> listViewData = FXCollections.observableArrayList();
		// 2. listViewData��(����Ʈ��) ������S1 ~ ������S7 �߰��Ѵ�
		listViewData.add("������S1");
		listViewData.add("������S2");
		listViewData.add("������S3");
		listViewData.add("������S4");
		listViewData.add("������S5");
		listViewData.add("������S6");
		listViewData.add("������S7");
		// 3. ����Ʈ�信 listViewData�� �߰��Ѵ�.
		listView.setItems(listViewData);
		// 4. ����Ʈ�信 �̺�Ʈó���Ѵ�. (��Ʈ: getSelectionModel())
		listView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				int number= newValue.intValue();
				tableView.getSelectionModel().select(number);
				tableView.scrollTo(number);
			}
		});
		// 4.1 ���̺�� ��ġ�� �ο��Ѵ�. �����Ѵ�.
		// 4.2 ���̺�� scrollTo(��ġ)�����Ѵ�.
	}

	public void handlerButtonOKAction(ActionEvent e) {
		String data =listView.getSelectionModel().getSelectedItem();
		System.out.println(data);
		// 1. ���õ� ����Ʈ�並 �����ͼ�. getSelectionModel() ����Ѵ�.
		Phone pData= tableView.getSelectionModel().getSelectedItem();
		System.out.println(pData.toString());
		// 2. ���õ� ���̺�並 �����ͼ� getSelectionModel() ����Ѵ�.
	}

	public void handlerButtonExitAction(ActionEvent e) {
		// 1. ����â�� �ݴ´�.
		Platform.exit();
	}

}