package chapter07.single;

public class SingleTonTest {
   public static void main(String [] args) {
//      SingleTon single = new SingleTon(); // ���� : private 
      SingleTon single = SingleTon.getsingleTon(); // ��ü �ޱ�.
      single.print();
      single.setString("�Ϸ� ����");
      single.print();
      SingleTon single2 = SingleTon.getsingleTon();
   }

}