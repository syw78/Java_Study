package chapter16.bakery;

public class Bakery {
	   private String bread;
	   private boolean isBread;
	   
	   public Bakery() {
	      super();
	      this.bread = null;
	      this.isBread = false;
	   }

	   public synchronized String getBread() throws InterruptedException {
	      while(!isBread) {
	         wait();
	      }
	      isBread=false;
	      notifyAll();
	      return bread;
	   }

	   public synchronized void setBread(String bread) throws InterruptedException {
	      while(isBread) {
	         wait();
	      }
	      isBread=true;
	      this.bread = bread;
	      notifyAll();
	   }
	   
	}
