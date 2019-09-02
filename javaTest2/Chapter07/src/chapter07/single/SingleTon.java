package chapter07.single;

public class SingleTon {
   private String string = "�����Ϸ� " ;
   //2. �������  ( �ڱ� ��ü�� ������ �ִ� ���� ��� ���� ) 
   private static SingleTon singleTon ; // null
   //3. SingleTon ��ü�� �����.
   static {
//      singleTon = new SingleTon();
   }
   //1. �����ڸ� �ܺο��� �������� ���ϵ��� �Ѵ�.
   private SingleTon() {}
   //4. singleTon ��ü�� ���� �Ѵ�.
   public static SingleTon getsingleTon()
   {
      if(singleTon==null)
      {
         singleTon = new SingleTon();
      }
      return singleTon;
   }
   //5. �츮�� ������ Ȱ���Ҽ� �ִ� ������ �����ش�.
   public void print() {
      System.out.println("���ڰ�ʹ�");
      System.out.println("Zzz..");
      System.out.println("Zzz....."+string);
   }
   public String getString() {
      return string;
   }
   public static SingleTon getSingleTon() {
      return singleTon;
   }
   public void setString(String string) {
      this.string = string;
   }
   public static void setSingleTon(SingleTon singleTon) {
      SingleTon.singleTon = singleTon;
   }
   
}
