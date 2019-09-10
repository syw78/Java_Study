package chapter16.bakery;

public class Baker implements Runnable {
	   // ¸â¹öº¯¼ö
	   private static String[] menu = {"´ÜÆÏ»§","ÇÇÀÚ»§","½Ä»§","°í·ÎÄÉ»§","ºØ¾î»§"};
	   private Bakery bakery;

	   // »ı¼ºÀÚÇÔ¼ö
	   public Baker(Bakery bakery) {
	      super();
	      this.bakery = bakery;
	   }
	   @Override
	   public void run() {
	      //1. 5¹ø µ¹¸°´Ù
	      for(int i=0;i<5;i++) {
	         try {
	            this.bakery.setBread(menu[i]);
	            System.out.println(menu[i]+"À» ¸¸µé¾ú½À´Ï´Ù.");
	            Thread.sleep(100);
	         } catch (InterruptedException e) {}
	      }
	   }//end of for

	}
