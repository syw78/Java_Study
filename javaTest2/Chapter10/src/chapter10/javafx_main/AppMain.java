package chapter10.javafx_main;



import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javafx.application.Application;
import javafx.stage.Stage;

//첫번째로는 라이브러리를 추가한다!
public class AppMain extends Application { // 어플리케이션은 추상화 클래스
	//1생성자 콜함수. 멤버변수 초기화시키는데 없으니까 안해도됨
	public AppMain() { // 기본 생성자를부른다. 어디생성자? 런치를 가지고있는 이클래스 생성자
		System.out.println(Thread.currentThread().getName() + "스레드 AppMain()생성자");
	}
	
	// 메인에서 런치를 부르는 순간 기본생성자 ,아이나이트 , 스타트를 부른다!
	// 이것을 "생명주기" 라고 부른다!

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + "스레드 main()");
		launch(args); // 어플리케이션 상속받을때는 메인에 런치를 불러야한다! 이렇게 부르면 파라미터스 멤버에다가 (args를)저장 해둔다.
		// 런치 정적메소드.
	}

	//init() 콜함수 
	@Override
	public void init() throws Exception {
		//System.out.println(Thread.currentThread().getName() + "스레드 init()");
		//System.out.println("init() 콜");
		Parameters ps =getParameters(); //정보가 들어있다 
//		List<String> list=ps.getRaw(); 			리스트로 가져오는것.
//		for(String value:list){
//			System.out.print(value);}
		Map<String, String> map= ps.getNamed();
		Set<Entry<String,String>> set =map.entrySet();		//map으로 가져오는법
		for(Entry<String,String> entry : set ) {
			String key=entry.getKey();
			String value = entry.getValue();
			System.out.println("key="+key+" value="+value);
		}
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName() + "스레드 start()");
		primaryStage.setTitle("서연우 창"); // 창 이름 설정하는것. 셋타이틀 간판설정!
		System.out.println("start()함수 생성");
		primaryStage.show(); // ↑스테이지 옆에 프라이머리스테이지로 바꾼다
		// 이 모든게 창하나 띄우는 방법.

	}
	//어떤 스레드가 쓰이냐 하면 아이나이트에서는 자바에프엑스런처 나머지는 자바에프엑스어플리케이션 스레드
	
	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName() + "스레드 stop()");
		//컨트롤 스페이스바로 stop();부른ㄴ다
		
	}
}
