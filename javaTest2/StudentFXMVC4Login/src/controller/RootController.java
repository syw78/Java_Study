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
	ObservableList<Student> data; // 테이블뷰에 보여주기위해서 저장된 데이터

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 1.버튼초기화 (총점,초기화,종료는 보여야한다. 평균,등록은 안보여야한다.)
		buttonInitSetting(false, true, false, true, false);

		// 2.테이블설정기능
		tableViewSetting();
		// 3.총점버튼을 눌렀을때 평균버튼활성화 및 6개값 총점을 구해서 총점필드적어놓는다.
		btnTotal.setOnAction(e -> handlerBtnTotalAction(e));
		// 4.평균버튼을 눌렀을때 평균계산, 충점버튼비활성,평균버튼비활성,등록활성화,모든텍스트필드비활성화
		btnAvg.setOnAction(e -> handlerBtnAvgAction(e));
		// 5.초기화버튼을 눌렀을때 1번 버튼초기화, 텍스트필드모두풀것.
		btnInit.setOnAction(e -> handlerBtnInitAction(e));
		// 6.등록버튼을 눌렀을때 테이블에 등록하고,모든값을 초기화한다.
		btnOk.setOnAction(e -> handlerBtnOkAction(e));

		// 테스팅을 위한 디버깅
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
		// 총점과 평균이 있는지 확인한다.
		try {

			if (txtTotal.getText().equals("") || txtAvg.getText().equals("")) {
				throw new Exception();
				
			} else {
				Student student = new Student(txtName.getText(), txtLevel.getText(), txtBan.getText(), txtKo.getText(),
						txtEng.getText(), txtMath.getText(), txtSic.getText(), txtSoc.getText(), txtMusic.getText(),
						txtTotal.getText(), txtAvg.getText());
				data.add(student);
				alertDisplay(1,"등록성공", "테이블등록성공","축하축하");
			}
		} catch (Exception e2) {
			alertDisplay(1, "등록실패", "합계,평균,제대로입력요망", "정신차려");
			return;
		}
		//5.초기화 버튼을 눌렀을때 1번버튼 초기화 , 텍스트필드 모두 활성화.
		handlerBtnInitAction(e);
	}

	public void handlerBtnInitAction(ActionEvent e) {
		buttonInitSetting(false, true, false, true, false);
		// 텍스트 필드 모두 활성화
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
		btnTotal.setDisable(b); // disable 안보이게한다 라는 뜻.
		btnAvg.setDisable(c); // disable 안보이게한다 라는 뜻.
		btnInit.setDisable(d); // disable 안보이게한다 라는 뜻.
		btnOk.setDisable(e); // disable 안보이게한다 라는 뜻.
		btnExit.setDisable(f); // disable 안보이게한다 라는 뜻.

		txtTotal.setDisable(true);
		txtAvg.setDisable(true);
	}

	public void tableViewSetting() {
		// 2.테이블 설정 얼레이리스트설정
		data = FXCollections.observableArrayList();
		// 2.테이블 설정에서 테이블뷰를 편집못하게 설정.
		tableView.setEditable(false);
		// 2.테이블 설정에서 컬럼을 세팅한다.
		TableColumn colName = new TableColumn("성명");
		colName.setMaxWidth(70);
		colName.setStyle("-fx-alignment: CENTER;");
		colName.setCellValueFactory(new PropertyValueFactory("name"));

		TableColumn colLevel = new TableColumn("학년");
		colLevel.setMaxWidth(40);
		colLevel.setStyle("-fx-alignment: CENTER;");
		colLevel.setCellValueFactory(new PropertyValueFactory("level"));

		TableColumn colBan = new TableColumn("반");
		colLevel.setMaxWidth(40);
		colLevel.setStyle("-fx-alignment: CENTER;");
		colLevel.setCellValueFactory(new PropertyValueFactory("ban"));

		TableColumn colKo = new TableColumn("국어");
		colLevel.setMaxWidth(40);
		colLevel.setStyle("-fx-alignment: CENTER;");
		colLevel.setCellValueFactory(new PropertyValueFactory("korean"));

		TableColumn colEng = new TableColumn("영어");
		colLevel.setMaxWidth(40);
		colLevel.setStyle("-fx-alignment: CENTER;");
		colLevel.setCellValueFactory(new PropertyValueFactory("english"));

		TableColumn colMath = new TableColumn("수학");
		colLevel.setMaxWidth(40);
		colLevel.setStyle("-fx-alignment: CENTER;");
		colLevel.setCellValueFactory(new PropertyValueFactory("math"));

		TableColumn colSic = new TableColumn("과학");
		colLevel.setMaxWidth(40);
		colLevel.setStyle("-fx-alignment: CENTER;");
		colLevel.setCellValueFactory(new PropertyValueFactory("sic"));

		TableColumn colSoc = new TableColumn("사회");
		colLevel.setMaxWidth(40);
		colLevel.setStyle("-fx-alignment: CENTER;");
		colLevel.setCellValueFactory(new PropertyValueFactory("soc"));

		TableColumn colMusic = new TableColumn("음악");
		colLevel.setMaxWidth(40);
		colLevel.setStyle("-fx-alignment: CENTER;");
		colLevel.setCellValueFactory(new PropertyValueFactory("music"));

		TableColumn colTotal = new TableColumn("총점");
		colLevel.setMaxWidth(50);
		colLevel.setStyle("-fx-alignment: CENTER;");
		colLevel.setCellValueFactory(new PropertyValueFactory("total"));

		TableColumn colAvg = new TableColumn("평균");
		colLevel.setMaxWidth(70);
		colLevel.setStyle("-fx-alignment: CENTER;");
		colLevel.setCellValueFactory(new PropertyValueFactory("avg"));

		// 2.테이블설정 컬럼들 객체를 테이블뷰에 리스트추가 및 항목 추가.
		tableView.setItems(data);
		tableView.getColumns().addAll(colName, colLevel, colBan, colKo, colEng, colMath, colSic, colSoc, colMusic,
				colTotal, colAvg);
	}

	public void handlerBtnAvgAction(ActionEvent e) {
		txtAvg.setText(String.valueOf(Integer.parseInt((txtTotal.getText())) / 6.0));
		// 1.버튼초기화(총점x,평균x,초기화,등록,종료)
		buttonInitSetting(true, true, false, false, false);
		// 텍스트필드 비활성화(이름,학년,반,국어,영어,수학,과학,사회,음악)
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
			alertDisplay(1, "합계실패", "계산오류", e2.toString());
		}
	}

	public void alertDisplay(int type, String title, String headerText, String contentText) {
		Alert alert = null; // 경고창을 주는것,CONFIRMATION은 확증 뭐뭐 하겠습니까? , 인포메이션은 정보
		switch (type) {
		case 1:
			alert = new Alert(AlertType.WARNING); // 경고창을 주는것,CONFIRMATION은 확증 뭐뭐 하겠습니까? , 인포메이션은 정보
			// 보여주는것
			// 1.아이디와 패스워드가 올바르게 입력했을때 경고창을 준다.
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
		alert.showAndWait(); // 보여주는것
	}

}
