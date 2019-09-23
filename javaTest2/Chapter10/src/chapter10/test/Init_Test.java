package chapter10.test;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javafx.application.Application;
import javafx.stage.Stage;

public class Init_Test extends Application {

	
	
	@Override
	public void start(Stage stage) throws Exception {
		stage.show();
		Parameters para = getParameters();
		List<String> list = para.getRaw();
		for(String str:list) {
			System.out.println(str);
	}
		Map<String, String> map = para.getNamed();
		Set<Entry<String, String>> ent = map.entrySet();
		for(Entry<String, String> value:ent) {
			String key = value.getKey();
			String value2= value.getValue();
			System.out.println("key="+key+" "+"value="+value2);
		}
		
		
	}
	public static void main(String[] args) {
		launch(args);
		
	}
	@Override
	public void stop() throws Exception {
		System.out.println("Ã¢ Á¾·á");
	}
}
