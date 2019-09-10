package chapter16.bakery;

public class Guest extends Thread {
	   // 멤버변수
	   private Bakery bakery;

	   // 생성자함수
	   public Guest(Bakery bakery) {
	      this.bakery = bakery;
	   }

	   @Override
	   public void run() {
	      for(int i=0;i<5;i++) {
	         try {
	            String str = bakery.getBread();
	            System.out.println(str+"을 먹었습니다.");
	            Thread.sleep(100);
	         } catch (InterruptedException e) {}
	      }
	   }

	}
