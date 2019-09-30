package chapter10.media_player;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class RootController implements Initializable {
	//1. �����������(ȭ�鿡�ִ� ��ü���̵�� ���� �Ѵ�. )
		@FXML private ImageView imageView;
		@FXML private MediaView mediaView; 
		@FXML private Button buttonPlay;
		@FXML private Button buttonPause;
		@FXML private Button buttonStop;
		@FXML private ProgressBar progressBar;
		@FXML private ProgressIndicator progressIndicator;
		@FXML private Slider slider;
		@FXML private Label labelTime;
		private boolean endOfMedia =false;
		
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			//1. �̵����� �����ϱ� ���ؼ��� �̵�ü�� �����;ߵȴ�(��Ʈ��)
			Media media=new Media(getClass().getResource("media/video.mp4").toString());
			//2. �̵�� �÷��̾ ����� �̵�ü�� �޴´�.
			MediaPlayer mediaPlayer=new MediaPlayer(media);
			//3. �̵��信 �̵���÷��̾ �����Ѵ�.
			mediaView.setMediaPlayer(mediaPlayer);
			//4.�����̴��� �̵���÷��̾� ������ �߰����� ����.
			slider.setValue(50.0);
			mediaPlayer.setVolume(slider.getValue()/100.0);
			
			slider.valueProperty().addListener(new ChangeListener<Number>() {

				@Override
				public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
					mediaPlayer.setVolume(newValue.longValue()/100.0);
				}
			});
			
			//4. �غ���� �˷��ִ»���
			mediaPlayer.setOnReady(()-> {
					//���Ȱ��ȭ, ���� ��Ȱ��ȭ, ���� ��Ȱ��ȭ
					buttonPlay.setDisable(false);
					buttonPause.setDisable(true);
					buttonStop.setDisable(true);
					
					//�̵�� �÷��̾ ���� �ð��� ����ɶ����� ������Ƽ ������� �ð����� �˷��ش�.
					//���α׷����� �̺�Ʈ�� ����(������Ƽ������� �̺�Ʈ ó��)
					mediaPlayer.currentTimeProperty().addListener(new ChangeListener<Duration>() {
						@Override
						public void changed(ObservableValue<? extends Duration> observable, Duration oldValue,
								Duration newValue) {
							double currentTime=mediaPlayer.getCurrentTime().toSeconds();
							double totalTime = mediaPlayer.getTotalDuration().toSeconds();
							progressBar.setProgress(currentTime/totalTime);
							progressIndicator.setProgress(currentTime/totalTime);
							labelTime.setText((int)currentTime+" / "+(int)totalTime);
							
						}
					});
					
					//�غ���¿��� �ڵ����� ����ȴٸ� ������ �̵��並 ����������
//					if(mediaPlayer.isAutoPlay()) {
//						mediaView.setVisible(false);
//					}
			});
			
			//5. ��������� �Ǿ�����
			mediaPlayer.setOnPlaying(()-> {
					//�����Ȱ��ȭ, ���� Ȱ��ȭ, ���� Ȱ��ȭ
					buttonPlay.setDisable(true);
					buttonPause.setDisable(false);
					buttonStop.setDisable(false);
			});
			//6. ��������� ����Ǿ�����
			mediaPlayer.setOnPaused(()-> {
					//���Ȱ��ȭ, ���� ��Ȱ��ȭ, ���� Ȱ��ȭ
					buttonPlay.setDisable(false);
					buttonPause.setDisable(true);
					buttonStop.setDisable(false);
			});
			//7. ���������� �߻��Ǿ�����
			mediaPlayer.setOnStopped(()-> {
					//�̵���÷��̾ ���������� �߻��̵Ǹ� 
					//�������� ����ġ�� ��������
					mediaPlayer.seek(mediaPlayer.getStartTime());
					//���Ȱ��ȭ, ���� ��Ȱ��ȭ, ���� ��Ȱ��ȭ
					buttonPlay.setDisable(false);
					buttonPause.setDisable(true);
					buttonStop.setDisable(true);
			});
			
			//8. �������� ��������
			mediaPlayer.setOnEndOfMedia(()-> {
					//���Ȱ��ȭ, ���� ��Ȱ��ȭ, ���� ��Ȱ��ȭ
					buttonPlay.setDisable(false);
					buttonPause.setDisable(true);
					buttonStop.setDisable(true);
					//�������� ������ �������� ���α׷������� �÷��� ������ �˷��ش�.
					endOfMedia= true;
					//�������� ������ ���α׷����ٿ� �ε�����͸� 1�� �����ؾ��Ѵ�.
					progressBar.setProgress(1.0);
					progressIndicator.setProgress(1.0);
					labelTime.setText("�Ϸ�");
					
			});
			
			//�÷��� ��ư�� ��������
			buttonPlay.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					if(endOfMedia) {
						mediaPlayer.stop();
						mediaPlayer.seek(mediaPlayer.getStartTime());
					}
					mediaPlayer.play();
					endOfMedia= false;  //���̳������� true�� �ش�.
				}
			});
			
			buttonPause.setOnAction((event)-> {mediaPlayer.pause();});
			buttonStop.setOnAction(e->{mediaPlayer.stop();});
			
			
		}//end of initialize
}
