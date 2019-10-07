package controller;

import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.ParsePosition;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.Student;

public class RootController implements Initializable {
	@FXML
	private TextField txtName;
	@FXML
	private ComboBox<String> cbYear;
//	@FXML private TextField txtLevel;
	@FXML
	private ToggleGroup genderGroup;
	@FXML
	private RadioButton rbMale;
	@FXML
	private RadioButton rbFemale;
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
	// �˻�����߰�
	@FXML
	private TextField txtSearch;
	@FXML
	private Button btnSearch;
	// ����,������ư�߰�
	@FXML
	private Button btnEdit;
	@FXML
	private Button btnDelete;
	// �����Ҷ��� ��ư�������� ����
	private boolean editDelete = false;
	// ���̺�並 ���������� ��ġ���� ��ü���� �����Ҽ��ִ� ���� ����
	private int selectedIndex;
	private ObservableList<Student> selectStudent;

	@FXML
	private TableView<Student> tableView;
	ObservableList<Student> data; // ���̺�信 �����ֱ����ؼ� ����� ����Ÿ

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// 1. ��ư�ʱ�ȭ(����, ���x,�ʱ�ȭ,���x,����,����x,����x)
		buttonInitSetting(false, true, false, true, false, true, true);
		// 1.2 �޺��ڽ� �ʱ�ȭ
		cbYear.setItems(FXCollections.observableArrayList("1", "2", "3", "4", "5", "6"));
		// 2. ���̺������(���������˼�������)
		tableViewSetting();
		// 3. ������ư�� �������� ��չ�ưȰ��ȭ �� 6���� ������ ���ؼ� �����ʵ�������´�.
		btnTotal.setOnAction(e -> {
			handlerBtnTotalAction(e);
		});
		// 4. ��չ�ư�� �������� ��հ��, ������ư��Ȱ��,��չ�ư��Ȱ��,���Ȱ��ȭ,����ؽ�Ʈ�ʵ��Ȱ��ȭ
		btnAvg.setOnAction(e -> {
			handlerBtnAvgAction(e);
		});
		// 5. �ʱ�ȭ��ư�� �������� 1�� ��ư�ʱ�ȭ, �ؽ�Ʈ �ʵ� ���Ȱ��ȭ
		btnInit.setOnAction(e -> {
			handlerBtnInitAction(e);
		});
		// 6. ��Ϲ�ư�� �������� ���̺� ����ϰ�, ��簪�� �ʱ�ȭ�Ѵ�.
		btnOk.setOnAction(e -> {
			handlerBtnOkAction(e);
		});
		// 7. �˻���ư�� �������� ���̺�信�� ã����
		btnSearch.setOnAction(e -> {
			handlerBtnSearchAction(e);
		});
		// 8. ������ư�� �������� ���̺�信�� �������
		btnDelete.setOnAction(e -> {
			handlerBtnDeleteAction(e);
		});
		// 9. ���̺�信�� �������� �̺�Ʈ ó�����
		tableView.setOnMousePressed(e -> {
			handlerTableViewPressedAction(e);
		});
		// 10. ������ư�� �������� �̺�Ʈ ó�����
		btnEdit.setOnAction(e -> {
			handlerBtnEditAction(e);
		});
		// 11. �����ư�� �������� �̺�Ʈ ó�����
		btnExit.setOnAction(e6 -> {
			Platform.exit();
		});
		//12.���̺�� ���콺�� ����Ŭ�������� ���õ� ������ �߽����� ������Ʈ ���̱�
		tableView.setOnMouseClicked(e7 -> {
			handlerPieChartAction(e7);
			
		});
		

		// �׽����� ���� �����
		txtName.setText("aaa");
		// txtLevel.setText("2");
		cbYear.setValue("2");
		rbFemale.setSelected(true);
		txtBan.setText("2");
		txtKo.setText("23");
		txtEng.setText("23");
		txtMath.setText("23");
		txtSic.setText("23");
		txtSoc.setText("23");
		txtMusic.setText("23");
	}

	


	private void handlerPieChartAction(MouseEvent e7) {
		try {
		//�ι�Ŭ�����ߴ����� �����Ѵ�.
		if(e7.getClickCount()!=2) {
			return;
		}
		//�ι� Ŭ���� �Ǿ�����
			Parent pieChartRoot= FXMLLoader.load(getClass().getResource("/view/piechart.fxml"));
			Stage stage = new Stage(StageStyle.UTILITY);
			stage.initModality(Modality.WINDOW_MODAL);
			stage.initOwner(btnOk.getScene().getWindow());
			stage.setTitle(selectStudent.get(0).getName()+"�հ� ��� ������Ʈ");
			
			PieChart pieChart =(PieChart)pieChartRoot.lookup("#pieChart");
			Button btnClose= (Button) pieChartRoot.lookup("#btnClose");
			//�׷��� �׸���
			pieChart.setData(FXCollections.observableArrayList(
					new PieChart.Data("����",Double.parseDouble(selectStudent.get(0).getTotal())),
					new PieChart.Data("���",Double.parseDouble(selectStudent.get(0).getAvg()))
					));
			btnClose.setOnAction((e8)-> {
				stage.close();
			});
			
			Scene scene =new Scene(pieChartRoot);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	// 1. ��ư�ʱ�ȭ(����,���,�ʱ�ȭ,���,����,����,����)���� �� ����, ��� �ؽ�Ʈ�ʵ� ��Ȱ��ȭ
	public void buttonInitSetting(boolean b, boolean c, boolean d, boolean e, boolean f, boolean g, boolean h) {
		btnTotal.setDisable(b);
		btnAvg.setDisable(c);
		btnInit.setDisable(d);
		btnOk.setDisable(e);
		btnExit.setDisable(f);
		btnEdit.setDisable(g);
		btnDelete.setDisable(h);
		txtTotal.setDisable(true);
		txtAvg.setDisable(true);

	}

	// 2. ���̺������(���������˼�������)
	public void tableViewSetting() {
		// 2. ���̺��� ���̸���Ʈ����
		data = FXCollections.observableArrayList();
		// 2. ���̺��� ���̺�並 �������ϰ� ����
		tableView.setEditable(false);

		// 3.�ؽ�Ʈ�� ���ڸ� �Է�
		// ���ڸ� �Է�
		DecimalFormat format = new DecimalFormat("###");
		// ���� �Է½� ���� ���� �̺�Ʈ ó��
		txtKo.setTextFormatter(new TextFormatter<>(event -> {
			if (event.getControlNewText().isEmpty()) {
				return event;
			}
			ParsePosition parsePosition = new ParsePosition(0);
			Object object = format.parse(event.getControlNewText(), parsePosition);
			if (object == null || parsePosition.getIndex() < event.getControlNewText().length()
					|| event.getControlNewText().length() == 4) {
				return null;
			} else {
				return event;
			}
		}));
		// ----------------------------------------------
		txtEng.setTextFormatter(new TextFormatter<>(event -> {
			if (event.getControlNewText().isEmpty()) {
				return event;
			}
			ParsePosition parsePosition = new ParsePosition(0);
			Object object = format.parse(event.getControlNewText(), parsePosition);
			if (object == null || parsePosition.getIndex() < event.getControlNewText().length()
					|| event.getControlNewText().length() == 4) {
				return null;
			} else {
				return event;

			}
		}));
		
		txtMath.setTextFormatter(new TextFormatter<>(event -> {
			if (event.getControlNewText().isEmpty()) {
				return event;
			}
			ParsePosition parsePosition = new ParsePosition(0);
			Object object = format.parse(event.getControlNewText(), parsePosition);
			if (object == null || parsePosition.getIndex() < event.getControlNewText().length()
					|| event.getControlNewText().length() == 4) {
				return null;
			} else {
				return event;
			}
		}));
		
		txtSic.setTextFormatter(new TextFormatter<>(event -> {
			if (event.getControlNewText().isEmpty()) {
				return event;
			}
			ParsePosition parsePosition = new ParsePosition(0);
			Object object = format.parse(event.getControlNewText(), parsePosition);
			if (object == null || parsePosition.getIndex() < event.getControlNewText().length()
					|| event.getControlNewText().length() == 4) {
				return null;
			} else {
				return event;
			}
		}));
		
		txtSoc.setTextFormatter(new TextFormatter<>(event -> {
			if (event.getControlNewText().isEmpty()) {
				return event;
			}
			ParsePosition parsePosition = new ParsePosition(0);
			Object object = format.parse(event.getControlNewText(), parsePosition);

			if (object == null || parsePosition.getIndex() < event.getControlNewText().length()
					|| event.getControlNewText().length() == 4) {
				return null;
			} else {
				return event;
			}
		}));
		
		txtMusic.setTextFormatter(new TextFormatter<>(event -> {
			if (event.getControlNewText().isEmpty()) {
				return event;
			}
			ParsePosition parsePosition = new ParsePosition(0);
			Object object = format.parse(event.getControlNewText(), parsePosition);
			if (object == null || parsePosition.getIndex() < event.getControlNewText().length()
					|| event.getControlNewText().length() == 4) {
				return null;
			} else {
				return event;
			}
		}));

		// 2. ���̺��� �÷�����
		TableColumn colName = new TableColumn("����");
		colName.setMaxWidth(70);
		colName.setStyle("-fx-alignment: CENTER;");
		colName.setCellValueFactory(new PropertyValueFactory("name"));

		TableColumn colLevel = new TableColumn("�г�");
		colLevel.setMaxWidth(40);
		colLevel.setStyle("-fx-alignment: CENTER;");
		colLevel.setCellValueFactory(new PropertyValueFactory("level"));

		TableColumn colBan = new TableColumn("��");
		colBan.setMaxWidth(40);
		colBan.setStyle("-fx-alignment: CENTER;");
		colBan.setCellValueFactory(new PropertyValueFactory("ban"));

		TableColumn colGender = new TableColumn("����");
		colGender.setMaxWidth(40);
		colGender.setStyle("-fx-alignment: CENTER;");
		colGender.setCellValueFactory(new PropertyValueFactory("gender"));

		TableColumn colKorean = new TableColumn("����");
		colKorean.setMaxWidth(40);
		colKorean.setCellValueFactory(new PropertyValueFactory<>("korean"));

		TableColumn colEnglish = new TableColumn("����");
		colEnglish.setMaxWidth(40);
		colEnglish.setCellValueFactory(new PropertyValueFactory<>("english"));

		TableColumn colMath = new TableColumn("����");
		colMath.setMaxWidth(40);
		colMath.setCellValueFactory(new PropertyValueFactory<>("math"));

		TableColumn colSic = new TableColumn("����");
		colSic.setMaxWidth(40);
		colSic.setCellValueFactory(new PropertyValueFactory<>("sic"));

		TableColumn colSoc = new TableColumn("��ȸ");
		colSoc.setMaxWidth(40);
		colSoc.setCellValueFactory(new PropertyValueFactory<>("soc"));

		TableColumn colMusic = new TableColumn("����");
		colMusic.setMaxWidth(40);
		colMusic.setCellValueFactory(new PropertyValueFactory<>("music"));

		TableColumn colTotal = new TableColumn("����");
		colTotal.setMaxWidth(50);
		colTotal.setCellValueFactory(new PropertyValueFactory<>("total"));

		TableColumn colAvg = new TableColumn("���");
		colAvg.setMaxWidth(70);
		colAvg.setCellValueFactory(new PropertyValueFactory<>("avg"));

		// 2. ���̺��� �÷��� ��ü�� ���̺�信 ����Ʈ�߰� �� �׸��߰�
		tableView.setItems(data);
		tableView.getColumns().addAll(colName, colLevel, colBan, colGender, colKorean, colEnglish, colMath, colSic,
				colSoc, colMusic, colTotal, colAvg);

	}

	// 3. ������ư�� �������� ��չ�ưȰ��ȭ �� 6���� ������ ���ؼ� �����ʵ�������´�.
	public void handlerBtnTotalAction(ActionEvent e) {
		try {
			int korean = Integer.parseInt(txtKo.getText());
			int english = Integer.parseInt(txtEng.getText());
			int math = Integer.parseInt(txtMath.getText());
			int sic = Integer.parseInt(txtSic.getText());
			int soc = Integer.parseInt(txtSoc.getText());
			int music = Integer.parseInt(txtMusic.getText());
			if((korean<=100)&&(english<=100)&&(math<=100)&&(sic<=100)&&(soc<=100)&&(music<=100)) {
				//100�� ���ϰ� �ǰԲ� ����
				int total = korean + english + math + sic + soc + music;
				txtTotal.setText(String.valueOf(total));
				btnAvg.setDisable(false);
				
			}else {
				throw new Exception("��ȿ�Ѱ� ����");
			}
		} catch (Exception e2) {
			alertDisplay(1, "�հ����", "������", e2.toString());
		}
	}

	// 4. ��չ�ư�� �������� ��հ��, ������ư��Ȱ��,��չ�ư��Ȱ��,���Ȱ��ȭ,����ؽ�Ʈ�ʵ��Ȱ��ȭ
	public void handlerBtnAvgAction(ActionEvent e) {
		txtAvg.setText(String.valueOf(Integer.parseInt(txtTotal.getText()) / 6.0));
		// 1. ��ư�ʱ�ȭ(����x, ���x,�ʱ�ȭ,���,����,����x,����x)
		buttonInitSetting(true, true, false, false, false, true, true);
		// �ؽ�Ʈ�ʵ� ��Ȱ��ȭ(�̸�x,�г�x,��x,����x,����x,����x,����x,����x,��ȸx,����x)
		textFieldInitSetting(true, true, true, true, true, true, true, true, true, true);

	}

	// 5. �ʱ�ȭ��ư�� �������� 1�� ��ư�ʱ�ȭ, �ؽ�Ʈ �ʵ� ���Ȱ��ȭ
	public void handlerBtnInitAction(ActionEvent e) {
		// 1. ��ư�ʱ�ȭ(����, ���x,�ʱ�ȭ,���x,����,����x,����x)
		buttonInitSetting(false, true, false, true, false, true, true);
		// �ؽ�Ʈ�ʵ� Ȱ��ȭ(�̸�,�г�,��,����,����,����,����,����,��ȸ,����)
		textFieldInitSetting(false, false, false, false, false, false, false, false, false, false);
		// �ؽ�Ʈ�ʵ� �ʱ�ȭ
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

	// 6. ��Ϲ�ư�� �������� ���̺� ����ϰ�, ��簪�� �ʱ�ȭ�Ѵ�.
	private void handlerBtnOkAction(ActionEvent e) {
		// ������ ����� �ִ��� Ȯ���Ѵ�.
		try {
			if (txtTotal.getText().equals("") || txtAvg.getText().equals("")) {
				throw new Exception();
			} else {
				Student student = new Student(txtName.getText(), cbYear.getSelectionModel().getSelectedItem(),
						txtBan.getText(), genderGroup.getSelectedToggle().getUserData().toString(), txtKo.getText(),
						txtEng.getText(), txtMath.getText(), txtSic.getText(), txtSoc.getText(), txtMusic.getText(),
						txtTotal.getText(), txtAvg.getText());
				// ���̺�信 ������ ����
				if (editDelete == true) {
					data.remove(selectedIndex);
					data.add(selectedIndex, student);
					editDelete = false;
				} else {
					data.add(student);
				}
				alertDisplay(1, "��ϼ���", "���̺��ϼ���", "��������..");
			}
		} catch (Exception e2) {
			alertDisplay(1, "��Ͻ���", "�հ�,���������Է¿��", "��������");
			return;
		}
		// 5. �ʱ�ȭ��ư�� �������� 1�� ��ư�ʱ�ȭ, �ؽ�Ʈ �ʵ� ���Ȱ��ȭ
		handlerBtnInitAction(e);
	}

	// 7. �˻���ư�� �������� ���̺�信�� ã����
	private void handlerBtnSearchAction(ActionEvent e) {
		for (Student student : data) {
			if (txtSearch.getText().equals(student.getName())) {
				tableView.getSelectionModel().select(student);
				return;
			}
		}
		alertDisplay(1, "�˻����", "�̸��˻�����", "��Ȯ���̸��� �Է¿��");
	}

	// 8. ������ư�� �������� ���̺�信�� �������
	private void handlerBtnDeleteAction(ActionEvent e) {
		data.remove(selectedIndex);
	}

	// 9. ���̺�信�� �������� �̺�Ʈ ó�����
	public void handlerTableViewPressedAction(MouseEvent e) {
		try{
		// �������� ��ġ�� �ش�� ��ü�� �����´�.
		editDelete = true;
		// 1. ��ư�ʱ�ȭ(����X, ���x,�ʱ�ȭ,���x,����,����,����)
		buttonInitSetting(true, true, true, true, false, false, false);

		selectedIndex = tableView.getSelectionModel().getSelectedIndex();
		selectStudent = tableView.getSelectionModel().getSelectedItems();
		// �������� ���̺� �ִ� ���� �����ͼ� �������ʵ忡 ����ִ´�.
		txtName.setText(selectStudent.get(0).getName());
		cbYear.setValue(selectStudent.get(0).getLevel());
		txtBan.setText(selectStudent.get(0).getBan());
		if (selectStudent.get(0).getGender().equals("����")) {
			rbMale.setSelected(true);
			rbFemale.setSelected(false);
		} else {
			rbMale.setSelected(false);
			rbFemale.setSelected(true);
		}
		txtKo.setText(selectStudent.get(0).getKorean());
		txtEng.setText(selectStudent.get(0).getEnglish());
		txtMath.setText(selectStudent.get(0).getMath());
		txtSic.setText(selectStudent.get(0).getSic());
		txtSoc.setText(selectStudent.get(0).getSoc());
		txtMusic.setText(selectStudent.get(0).getMusic());
		txtTotal.setText(selectStudent.get(0).getTotal());
		txtAvg.setText(selectStudent.get(0).getAvg());

		// �ؽ�Ʈ�ʵ� ��Ȱ��ȭ(�̸�x,�г�x,��x,����x,����x,����x,����x,����x,��ȸx,����x)
		textFieldInitSetting(true, true, true, true, true, true, true, true, true, true);
		
	}catch(Exception e2) {
		//1.��ư�ʱ�ȭ
		buttonInitSetting(false,true,false,true,false,true,true);
		editDelete=false;
		}
	}

	// 10. ������ư�� �������� �̺�Ʈ ó�����
	private void handlerBtnEditAction(ActionEvent e) {
		try {
		// 1. ��ư�ʱ�ȭ(����,���x,�ʱ�ȭ,���x,����,����x,����x)
		buttonInitSetting(false, true, false, true, false, true, true);
		// �ؽ�Ʈ�ʵ� ��Ȱ��ȭ(�̸�x,�г�x,��x,����x,����x,����x,����x,����x,��ȸx,����x)
		textFieldInitSetting(false, false, false, false, false, false, false, false, false, false);
		//����ȭ���� �θ���.
			Parent editRoot=FXMLLoader.load(getClass().getResource("/view/formedit.fxml"));
			Stage stageDialog=new Stage(StageStyle.UTILITY);
			stageDialog.initModality(Modality.WINDOW_MODAL); //��� ������ ���Ѵ�.
			stageDialog.initOwner(btnOk.getScene().getWindow());
			stageDialog.setTitle("���� â");
			//=====================�۾�����
			TextField editName = (TextField) editRoot.lookup("#txtName");
			TextField editYear = (TextField) editRoot.lookup("#txtYear");
			TextField editBan = (TextField) editRoot.lookup("#txtBan");
			TextField editGender = (TextField) editRoot.lookup("#txtGender");
			TextField editKorean = (TextField) editRoot.lookup("#txtKorean");
			TextField editEnglish = (TextField) editRoot.lookup("#txtEnglish");
			TextField editMath = (TextField) editRoot.lookup("#txtMath");
			TextField editSic = (TextField) editRoot.lookup("#txtSic");
			TextField editSoc = (TextField) editRoot.lookup("#txtSoc");
			TextField editMusic = (TextField) editRoot.lookup("#txtMusic");
			TextField editTotal = (TextField) editRoot.lookup("#txtTotal");
			TextField editAvg = (TextField) editRoot.lookup("#txtAvg");
			Button btnCal = (Button) editRoot.lookup("#btnCal");
			Button btnFormAdd = (Button) editRoot.lookup("#btnFormAdd");
			Button btnFormCancel = (Button) editRoot.lookup("#btnFormCancel");
			
			
			//������ ����� ������ ���� ���ϰ� �Ѵ�.
			editTotal.setDisable(true);
			editAvg.setDisable(true);
			//�ؽ�Ʈ ����Ʈ�� ���� �ִ´�.
			editName.setText(selectStudent.get(0).getName());
			editYear.setText(selectStudent.get(0).getLevel());
			editBan.setText(selectStudent.get(0).getBan());
			editGender.setText(selectStudent.get(0).getGender());
			editKorean.setText(selectStudent.get(0).getKorean());
			editEnglish.setText(selectStudent.get(0).getEnglish());
			editMath.setText(selectStudent.get(0).getMath());
			editSic.setText(selectStudent.get(0).getSic());
			editSoc.setText(selectStudent.get(0).getSoc());
			editMusic.setText(selectStudent.get(0).getMusic());
			editTotal.setText(selectStudent.get(0).getTotal());
			editAvg.setText(selectStudent.get(0).getAvg());
			//==========================================
			
			//��ư��� �̺�Ʈ ó��
			
			btnCal.setOnAction((e1)-> {	
				try {
					int korean = Integer.parseInt(editKorean.getText());
					int english = Integer.parseInt(editEnglish.getText());
					int math = Integer.parseInt(editMath.getText());
					int sic = Integer.parseInt(editSic.getText());
					int soc = Integer.parseInt(editSoc.getText());
					int music = Integer.parseInt(editMusic.getText());
					if((korean<=100)&&(english<=100)&&(math<=100)&&(sic<=100)&&(soc<=100)&&(music<=100)) {
						//100�� ���ϰ� �ǰԲ� ����
						int total = korean + english + math + sic + soc + music;
						editTotal.setText(String.valueOf(total));
						editAvg.setText(String.valueOf(total/6.0));
						editAvg.setDisable(false);
						
					}else {
						throw new Exception("��ȿ�Ѱ� ����");
					}
				} catch (Exception e2) {
					alertDisplay(1, "�հ����", "������", e2.toString());
				}
			});
			
			//�����ư �������� 
			btnFormAdd.setOnAction(e4-> {
					
				try {
					if (txtTotal.getText().equals("") || txtAvg.getText().equals("")) {
						throw new Exception();
					} else {
						Student student = new Student(editName.getText(), editYear.getText(),
								editBan.getText(), editGender.getText(), editKorean.getText(),
								editEnglish.getText(), editMath.getText(), editSic.getText(), editSoc.getText(), editMusic.getText(),
								editTotal.getText(), editAvg.getText());
						// ���̺�信 ������ ����
						if (editDelete == true) {
							data.remove(selectedIndex);
							data.add(selectedIndex, student);
							editDelete = false;
						}else {
							throw new Exception("������Ͽ���");
						}
					}
				} catch (Exception e2) {
					alertDisplay(1, "������Ͻ���", "������Ͻ���","��������"+e2.getMessage());
				}
			});
			
			
			
			//��ҹ�ư ��������
			btnFormCancel.setOnAction(e3-> {
				stageDialog.close();
			});
			
			Scene scene = new Scene(editRoot);
			stageDialog.setScene(scene);
			stageDialog.setResizable(false);
			stageDialog.show();
			
		
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	private void alertDisplay(int type, String title, String headerText, String contentText) {
		Alert alert = null;
		switch (type) {
		case 1:
			alert = new Alert(AlertType.WARNING);
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
		alert.setHeaderText(headerText);
		alert.setContentText(headerText + "\n" + contentText);
		alert.setResizable(false);
		alert.show();
	}

	// �ؽ�Ʈ�ʵ� ��Ȱ��ȭ(�̸�,�г�,��,����,����,����,����,����,��ȸ,����)
	private void textFieldInitSetting(boolean b, boolean c, boolean d, boolean k, boolean e, boolean f, boolean g,
			boolean h, boolean i, boolean j) {
		txtName.setDisable(b);
		cbYear.setDisable(c);
//		txtLevel.setDisable(c);
		txtBan.setDisable(d);
		rbMale.setDisable(k);
		rbFemale.setDisable(k);
		txtKo.setDisable(e);
		txtEng.setDisable(f);
		txtMath.setDisable(g);
		txtSic.setDisable(h);
		txtSoc.setDisable(i);
		txtMusic.setDisable(j);
	}
}
