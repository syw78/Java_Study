package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Student;

public class RootController implements Initializable {
	@FXML
	private TextField txtName;
	@FXML
	private TextField txtLevel;
	@FXML
	private TextField txtBan;
	@FXML
	private TextField txtKo;
	@FXML
	private TextField txtEng;
	@FXML
	private TextField txtMath;
	@FXML
	private TextField txtSic;
	@FXML
	private TextField txtSoc;
	@FXML
	private TextField txtMusic;
	@FXML
	private TextField txtTotal;
	@FXML
	private TextField txtAvg;
	@FXML
	private Button btnTotal;
	@FXML
	private Button btnAvg;
	@FXML
	private Button btnInit;
	@FXML
	private Button btnOk;
	@FXML
	private Button btnExit;
	@FXML
	private TableView<Student> tableView;
	ObservableList<Student> data; // ���̺�信 �����ֱ����ؼ� ����� ������

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 1.��ư�ʱ�ȭ (����,�ʱ�ȭ,����� �������Ѵ�. ���,����� �Ⱥ������Ѵ�.)
		buttonInitSetting(false, true, false, true, false);

		// 2.���̺������
		tableViewSetting();
		// 3.������ư�� �������� ��չ�ưȰ��ȭ �� 6���� ������ ���ؼ� �����ʵ�������´�.
		btnTotal.setOnAction(e -> handlerBtnTotalAction(e));
		// 4.��չ�ư�� �������� ��հ��, ������ư��Ȱ��,��չ�ư��Ȱ��,���Ȱ��ȭ,����ؽ�Ʈ�ʵ��Ȱ��ȭ
		btnAvg.setOnAction(e -> handlerBtnAvgAction(e));
		// 5.�ʱ�ȭ��ư�� �������� 1�� ��ư�ʱ�ȭ, �ؽ�Ʈ�ʵ���Ǯ��.
		btnInit.setOnAction(e -> handlerBtnInitAction(e));
		// 6.��Ϲ�ư�� �������� ���̺� ����ϰ�,��簪�� �ʱ�ȭ�Ѵ�.
		btnOk.setOnAction(e -> handlerBtnOkAction(e));

		// �׽����� ���� �����
		txtName.setText("aaa");
		txtLevel.setText("2");
		txtBan.setText("2");
		txtKo.setText("23");
		txtEng.setText("23");
		txtMath.setText("23");
		txtSic.setText("23");
		txtSoc.setText("23");
		txtMusic.setText("23");

	}

	public void handlerBtnOkAction(ActionEvent e) {
		// ������ ����� �ִ��� Ȯ���Ѵ�.
		try {

			if (txtTotal.getText().equals("") || txtAvg.getText().equals("")) {
				throw new Exception();
				
			} else {
				Student student = new Student(txtName.getText(), txtLevel.getText(), txtBan.getText(), txtKo.getText(),
						txtEng.getText(), txtMath.getText(), txtSic.getText(), txtSoc.getText(), txtMusic.getText(),
						txtTotal.getText(), txtAvg.getText());
				data.add(student);
				alertDisplay(1,"��ϼ���", "���̺��ϼ���","��������");
			}
		} catch (Exception e2) {
			alertDisplay(1, "��Ͻ���", "�հ�,���,������Է¿��", "��������");
			return;
		}
		//5.�ʱ�ȭ ��ư�� �������� 1����ư �ʱ�ȭ , �ؽ�Ʈ�ʵ� ��� Ȱ��ȭ.
		handlerBtnInitAction(e);
	}

	public void handlerBtnInitAction(ActionEvent e) {
		buttonInitSetting(false, true, false, true, false);
		// �ؽ�Ʈ �ʵ� ��� Ȱ��ȭ
		textFieldInitSetting(false,false,false,false,false,false,false,false,false);
//		txtName.clear();
//		txtLevel.clear();
//		txtBan.clear();
//		txtKo.clear();
//		txtEng.clear();
//		txtMath.clear();
//		txtSic.clear();
//		txtSoc.clear();
//		txtMusic.clear();
		txtTotal.clear();
		txtAvg.clear();

	}

	public void buttonInitSetting(boolean b, boolean c, boolean d, boolean e, boolean f) {
		btnTotal.setDisable(b); // disable �Ⱥ��̰��Ѵ� ��� ��.
		btnAvg.setDisable(c); // disable �Ⱥ��̰��Ѵ� ��� ��.
		btnInit.setDisable(d); // disable �Ⱥ��̰��Ѵ� ��� ��.
		btnOk.setDisable(e); // disable �Ⱥ��̰��Ѵ� ��� ��.
		btnExit.setDisable(f); // disable �Ⱥ��̰��Ѵ� ��� ��.

		txtTotal.setDisable(true);
		txtAvg.setDisable(true);
	}

	public void tableViewSetting() {
		// 2.���̺� ���� ���̸���Ʈ����
		data = FXCollections.observableArrayList();
		// 2.���̺� �������� ���̺�並 �������ϰ� ����.
		tableView.setEditable(false);
		// 2.���̺� �������� �÷��� �����Ѵ�.
		TableColumn colName = new TableColumn("����");
		colName.setMaxWidth(70);
		colName.setStyle("-fx-alignment: CENTER;");
		colName.setCellValueFactory(new PropertyValueFactory("name"));

		TableColumn colLevel = new TableColumn("�г�");
		colLevel.setMaxWidth(40);
		colLevel.setStyle("-fx-alignment: CENTER;");
		colLevel.setCellValueFactory(new PropertyValueFactory("level"));

		TableColumn colBan = new TableColumn("��");
		colLevel.setMaxWidth(40);
		colLevel.setStyle("-fx-alignment: CENTER;");
		colLevel.setCellValueFactory(new PropertyValueFactory("ban"));

		TableColumn colKo = new TableColumn("����");
		colLevel.setMaxWidth(40);
		colLevel.setStyle("-fx-alignment: CENTER;");
		colLevel.setCellValueFactory(new PropertyValueFactory("korean"));

		TableColumn colEng = new TableColumn("����");
		colLevel.setMaxWidth(40);
		colLevel.setStyle("-fx-alignment: CENTER;");
		colLevel.setCellValueFactory(new PropertyValueFactory("english"));

		TableColumn colMath = new TableColumn("����");
		colLevel.setMaxWidth(40);
		colLevel.setStyle("-fx-alignment: CENTER;");
		colLevel.setCellValueFactory(new PropertyValueFactory("math"));

		TableColumn colSic = new TableColumn("����");
		colLevel.setMaxWidth(40);
		colLevel.setStyle("-fx-alignment: CENTER;");
		colLevel.setCellValueFactory(new PropertyValueFactory("sic"));

		TableColumn colSoc = new TableColumn("��ȸ");
		colLevel.setMaxWidth(40);
		colLevel.setStyle("-fx-alignment: CENTER;");
		colLevel.setCellValueFactory(new PropertyValueFactory("soc"));

		TableColumn colMusic = new TableColumn("����");
		colLevel.setMaxWidth(40);
		colLevel.setStyle("-fx-alignment: CENTER;");
		colLevel.setCellValueFactory(new PropertyValueFactory("music"));

		TableColumn colTotal = new TableColumn("����");
		colLevel.setMaxWidth(50);
		colLevel.setStyle("-fx-alignment: CENTER;");
		colLevel.setCellValueFactory(new PropertyValueFactory("total"));

		TableColumn colAvg = new TableColumn("���");
		colLevel.setMaxWidth(70);
		colLevel.setStyle("-fx-alignment: CENTER;");
		colLevel.setCellValueFactory(new PropertyValueFactory("avg"));

		// 2.���̺��� �÷��� ��ü�� ���̺�信 ����Ʈ�߰� �� �׸� �߰�.
		tableView.setItems(data);
		tableView.getColumns().addAll(colName, colLevel, colBan, colKo, colEng, colMath, colSic, colSoc, colMusic,
				colTotal, colAvg);
	}

	public void handlerBtnAvgAction(ActionEvent e) {
		txtAvg.setText(String.valueOf(Integer.parseInt((txtTotal.getText())) / 6.0));
		// 1.��ư�ʱ�ȭ(����x,���x,�ʱ�ȭ,���,����)
		buttonInitSetting(true, true, false, false, false);
		// �ؽ�Ʈ�ʵ� ��Ȱ��ȭ(�̸�,�г�,��,����,����,����,����,��ȸ,����)
		textFieldInitSetting(true, true, true, true, true, true, true, true, true);

	}

	public void textFieldInitSetting(boolean b, boolean c, boolean d, boolean e, boolean f, boolean g, boolean h,
			boolean i, boolean j) {

		txtName.setDisable(b);
		txtLevel.setDisable(c);
		txtBan.setDisable(d);
		txtKo.setDisable(e);
		txtEng.setDisable(f);
		txtMath.setDisable(g);
		txtSic.setDisable(h);
		txtSoc.setDisable(i);
		txtMusic.setDisable(j);

	}

	public void handlerBtnTotalAction(ActionEvent e) {

		try {
			int sum = Integer.parseInt(txtKo.getText()) + Integer.parseInt(txtEng.getText())
					+ Integer.parseInt(txtMath.getText()) + Integer.parseInt(txtSic.getText())
					+ Integer.parseInt(txtSoc.getText()) + Integer.parseInt(txtMusic.getText());

			txtTotal.setText(String.valueOf(sum));
			btnAvg.setDisable(false);

		} catch (Exception e2) {
			alertDisplay(1, "�հ����", "������", e2.toString());
		}
	}

	public void alertDisplay(int type, String title, String headerText, String contentText) {
		Alert alert = null; // ���â�� �ִ°�,CONFIRMATION�� Ȯ�� ���� �ϰڽ��ϱ�? , �������̼��� ����
		switch (type) {
		case 1:
			alert = new Alert(AlertType.WARNING); // ���â�� �ִ°�,CONFIRMATION�� Ȯ�� ���� �ϰڽ��ϱ�? , �������̼��� ����
			// �����ִ°�
			// 1.���̵�� �н����尡 �ùٸ��� �Է������� ���â�� �ش�.
			break;
		case 2:
			alert = new Alert(AlertType.CONFIRMATION);
			break;
		case 3:
			alert = new Alert(AlertType.ERROR);
			break;
		case 4:
			alert = new Alert(AlertType.NONE);
			break;
		case 5:
			alert = new Alert(AlertType.INFORMATION);
			break;
		}
		alert.setTitle(title);
		alert.setHeaderText(headerText); //
		alert.setContentText(headerText + "\n" + contentText);
		alert.setResizable(false);
		alert.showAndWait(); // �����ִ°�
	}

}
