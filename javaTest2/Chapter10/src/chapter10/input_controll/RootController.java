package chapter10.input_controll;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Observer;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;




public class RootController implements Initializable {
	@FXML private TextField title;
	@FXML private PasswordField password;
	@FXML private ComboBox<String> comboBox;
	@FXML private DatePicker datePicker;
	@FXML private TextArea textArea;
	@FXML private Button buttonSave;
	@FXML private Button buttonExit;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//1.콤보박스에 항목 입력하기.
		ObservableList<String> list = FXCollections.observableArrayList();
		list.add("공개");
		list.add("비공개");
		comboBox.setItems(list);
		
		comboBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				String data=null;
				data=textArea.getText();
				textArea.setText(data+newValue);
			}
		});;
		
		buttonSave.setOnAction ((ActionEvent event)-> {
			String titleData=title.getText();
			String passwordData =password.getText();
			String comboBoxData=comboBox.getValue();
			LocalDate localDate= datePicker.getValue();
			String date= localDate.toString();
			textArea.setText(titleData+"\n"+passwordData+"\n"+comboBoxData+"\n"+localDate+"\n");
		});
		
		
	}//end of lnitialize
	public void handlerButtonExitAction(ActionEvent e) {
		textArea.setText(null);
	}
}
