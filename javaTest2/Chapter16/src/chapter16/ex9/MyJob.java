package chapter16.ex9;

public class MyJob implements Runnable {
	  public void run() {
          try {
                 System.out.println("A");
                 Thread.sleep(1000);
                 System.out.println("B");
          } catch (InterruptedException e) {
                 System.out.println("C");
          }
          System.out.println("D");
    }
}
