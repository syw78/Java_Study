package chpater10.view_controll2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;

public class RootController implements Initializable {
	//1. �������� (����Ʈ��, ���̺��, �̹�����)
	@FXML private ListView<String> listView;
	@FXML private TableView<Phone> tableView;
	@FXML private ImageView imageView;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	   //1. ����Ʈ�並 �׸��� �����ϰ� ������Ƽ �̺�Ʈó���Ѵ�.
	   insertListViewItemAndEventProcess();
	   //2. ���̺�並 �׸��� �����ϰ� ���̺��÷� �����ϰ�, ������Ƽ �̺�Ʈó���Ѵ�.
	   insertTableViewItemAndEventProcess();
	   
	} //end initialize
	private void insertTableViewItemAndEventProcess() {
	   //1. ObservableList<Phone>  tableViewData ��ü�� ���Ѵ�. 
		ObservableList<Phone> tableViewData= 
	   //2. tableViewData��(���̺��) new Phone("S1","phone01.png") �߰��Ѵ�
				
	   //3. �� ���̺��÷��� PhoneŬ���� ����̸��� �����Ѵ�. 
	    //TableColumn tcSmartPhone=tableView.getColumns().get(0);
	   // tcSmartPhone.setCellValueFactory(new PropertyValueFactory("smartPhone"));
	   //4. ���̺�信 tableViewData�� �߰��Ѵ�.
		//5. ���̺�信 �̺�Ʈó���Ѵ�. (��Ʈ: getSelectionModel())
	   //5.1  ���õ� phone��ü���� getImage �̸��� �����ͼ� imageView�� ����
	   //��Ų��. 
	}
	private void insertListViewItemAndEventProcess() {
	   //1. ObservableList<String>  listViewData ��ü�� ���Ѵ�. 
	   //2. listViewData��(����Ʈ��) ������S1 ~ ������S7  �߰��Ѵ�
	   //3. ����Ʈ�信 listViewData�� �߰��Ѵ�.
	   //4. ����Ʈ�信 �̺�Ʈó���Ѵ�. (��Ʈ: getSelectionModel())
	      //4.1 ���̺�� ��ġ�� �ο��Ѵ�. �����Ѵ�.
	      //4.2 ���̺�� scrollTo(��ġ)�����Ѵ�.
	}
	public void handlerButtonOkAction(ActionEvent e) {
	   //1. ���õ� ����Ʈ�並 �����ͼ�. getSelectionModel() ����Ѵ�.
	   //2. ���õ� ���̺�並 �����ͼ�  getSelectionModel() ����Ѵ�.
	}
	public void handlerButtonExitAction(ActionEvent e) {
	   //1. ����â�� �ݴ´�. 
		Platform.exit();
	}
	
}
