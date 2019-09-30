package chapter10.chart;

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
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;




public class RootController implements Initializable {
	@FXML private PieChart pieChart;
	@FXML private BarChart barChart;
	@FXML private AreaChart areaChart;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//������Ʈ PbservableList ����Ÿ�Է°� ���� -> ����Ʈ (PieChartList) -> ������Ʈ.setData(����Ʈ)
		ObservableList<PieChart.Data> pieChartList2 =FXCollections.observableArrayList();
		pieChartList2.add(new PieChart.Data("AWT", 10));
		pieChartList2.add(new PieChart.Data("SWING", 30));											//������Ʈ
		pieChartList2.add(new PieChart.Data("SWT", 25));
		pieChartList2.add(new PieChart.Data("JAVAFX",35 ));
		pieChart.setData(pieChartList2);
		//--------------------------------------------------------------------------------------------
		//����Ʈ = ����������Ʈ�� ����µ� 
		ObservableList<XYChart.Data> barChartList=FXCollections.observableArrayList();
		barChartList.add(new XYChart.Data("2015", 70));
		barChartList.add(new XYChart.Data("2016", 90));
		barChartList.add(new XYChart.Data("2017", 40));												//����Ʈ
		barChartList.add(new XYChart.Data("2018", 60));																
		
		XYChart.Series series1=new XYChart.Series();
		series1.setName("����");
		series1.setData(barChartList);
		
		barChart.getData().add(series1);
		
		ObservableList<XYChart.Data> barChartList2=FXCollections.observableArrayList();
		barChartList2.add(new XYChart.Data("2015", 50));
		barChartList2.add(new XYChart.Data("2016", 80));
		barChartList2.add(new XYChart.Data("2017", 70));											
		barChartList2.add(new XYChart.Data("2018", 90));																
		
		XYChart.Series series2=new XYChart.Series();
		series2.setName("����");
		series2.setData(barChartList2);
		
		barChart.getData().add(series2);
		
		//---------------------------------------------------------------------
		//�����  ��Ʈ
		ObservableList<XYChart.Data> barChartList3=FXCollections.observableArrayList();
		barChartList3.add(new XYChart.Data("2015", 50));
		barChartList3.add(new XYChart.Data("2016", 80));
		barChartList3.add(new XYChart.Data("2017", 70));												//area��Ʈ
		barChartList3.add(new XYChart.Data("2018", 90));																
		
		XYChart.Series series3=new XYChart.Series();
		series3.setName("��տµ�");
		series3.setData(barChartList3);
		areaChart.getData().add(series3);
		
		
		
	}//end of initialize
	
}
