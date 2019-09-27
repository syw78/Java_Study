package chapter10.media_player;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class RootController implements Initializable {
	//1. �����������(ȭ�鿡�ִ� ��ü���̵�� ���� �Ѵ�. )
		@FXML private ImageView imageView;
		@FXML private MediaView mediaView; 
		@FXML private Button buttonPlay;
		@FXML private Button buttonPause;
		@FXML private Button buttonStop;
		private boolean endOfMedia =false;
		
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			//1. �̵����� �����ϱ� ���ؼ��� �̵�ü�� �����;ߵȴ�(��Ʈ��)
			Media media=new Media(getClass().getResource("media/video.mp4").toString());
			//2. �̵�� �÷��̾ ����� �̵�ü�� �޴´�.
			MediaPlayer mediaPlayer=new MediaPlayer(media);
			//3. �̵��信 �̵���÷��̾ �����Ѵ�.
			mediaView.setMediaPlayer(mediaPlayer);
			//4. �غ���� �˷��ִ»���
			mediaPlayer.setOnReady(()-> {
					//���Ȱ��ȭ, ���� ��Ȱ��ȭ, ���� ��Ȱ��ȭ
					buttonPlay.setDisable(false);
					buttonPause.setDisable(true);
					buttonStop.setDisable(true);
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
					endOfMedia= false;
				}
			});
			
		}//end of initialize
}
