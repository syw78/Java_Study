package chapter07.single;

public class SingleTon {
   private String string = "과제완료 " ;
   //2. 멤버변수  ( 자기 객체를 가지고 있는 정적 멤버 변수 ) 
   private static SingleTon singleTon ; // null
   //3. SingleTon 객체를 만든다.
   static {
//      singleTon = new SingleTon();
   }
   //1. 생성자를 외부에서 접근하지 못하도록 한다.
   private SingleTon() {}
   //4. singleTon 객체를 리턴 한다.
   public static SingleTon getsingleTon()
   {
      if(singleTon==null)
      {
         singleTon = new SingleTon();
      }
      return singleTon;
   }
   //5. 우리가 실제로 활용할수 있는 내용을 적어준다.
   public void print() {
      System.out.println("잠자고싶다");
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
