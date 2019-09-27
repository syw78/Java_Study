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
		//1.����Ʈ�並 �׸��� �����ϰ� ������Ƽ �̺�Ʈ�� ó���Ѵ�.
		insertListViewItemAndEventProcess();
		//2.���̺�並 �׸��� �����ϰ� ���̺��÷������ϰ� , ������Ƽ �̺�Ʈ�� ó���Ѵ�.
		insertTableViewItemAndEventProcess();
		
		
	}//end of initialize
	private void insertTableViewItemAndEventProcess() {
		ObservableList<Phone>tableViewData=FXCollections.observableArrayList();
		tableViewData.add(new Phone("������S1", "phone01.png"));
		tableViewData.add(new Phone("������S2", "phone02.png"));
		tableViewData.add(new Phone("������S3", "phone03.png"));
		tableViewData.add(new Phone("������S4", "phone04.png"));
		tableViewData.add(new Phone("������S5", "phone05.png"));
		tableViewData.add(new Phone("������S6", "phone06.png"));
		tableViewData.add(new Phone("������S7", "phone07.png"));
		
		TableColumn tcSmartPhone=tableView.getColumns().get(0);  //0�� ����Ʈ��
		tcSmartPhone.setCellValueFactory(new PropertyValueFactory("smartPhone")); //�̸��� �״�� ������Ѵ�.
		tcSmartPhone.setStyle("-fx-alignment: CENTER");
		
		
		TableColumn tcImage=tableView.getColumns().get(1); //1�� �̹���
		tcImage.setCellValueFactory(new PropertyValueFactory("image")); //�̸��� �״�� ������Ѵ�.
		tcImage.setStyle("-fx-alignment: CENTER");
		
		tableView.setItems(tableViewData);
		//�ϰ������� �װ�ü�� ������ �ִµ� (������������Ƽ�� ��ü�����Ѱ� �ְ� �ε����� �ε��� ��ġ�� ���Ѱ��ش�) �����ϰڴ�
		//�ֵ� ������ : ��������� ��ȭ�ϸ� ������������ ��� �����°� ��ü�̴� 
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
		listViewData.add("������S1");
		listViewData.add("������S2");
		listViewData.add("������S3");
		listViewData.add("������S4");
		listViewData.add("������S5");
		listViewData.add("������S6");
		listViewData.add("������S7");
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
		System.out.println("���õ� �ڵ��� ����Ʈ�� ="+data);
		Phone phone=tableView.getSelectionModel().getSelectedItem();
		System.out.println("���õ� ���̺��� ="+phone.toString());
	}
	public void handlerButtonExitAction(ActionEvent e) {
		Platform.exit();
	}
}

