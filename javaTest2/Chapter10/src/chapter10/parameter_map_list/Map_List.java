package chapter10.parameter_map_list;



import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javafx.application.Application;

import javafx.stage.Stage;

public class Map_List extends Application {

	
	
	
	//���� ��Ʈ���� �ʿ�!
	@Override
	public void init() throws Exception {
	Parameters para = getParameters();
	Map<String, String> map = para.getNamed();
	Set<Entry<String, String>> ent = map.entrySet();
	for(Entry<String,String>value:ent) {
		
		String key = value.getKey();
		String value1= value.getValue();
		System.out.println("key="+key+" "+"value="+value1 );
	}

	}

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("����Ʈ and ������ ��������");
		stage.show();
	}
	@Override
	public void stop() throws Exception {
		System.out.println("â ����.");
	}

}
