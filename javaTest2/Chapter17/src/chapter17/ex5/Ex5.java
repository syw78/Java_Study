package chapter17.ex5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex5 {

   public static void main(String[] args) throws IOException {
      //������ �о���� Ŭ���� ����
      FileInputStream fis=null; BufferedInputStream bis=null; DataInputStream dis=null; File file=null;
      //���Ͽ� �����ϴ� Ŭ���� ����
      FileOutputStream fos=null; BufferedOutputStream bos=null; DataOutputStream dos=null; File file2=null;
      //======���Ͽ� �����ϴ� ���
      file2=new File("data.bin");
      fos=new FileOutputStream(file2);
      bos=new BufferedOutputStream(fos);
      dos=new DataOutputStream(bos);
      dos.writeInt(100);
      dos.writeShort(20);
      dos.writeLong(1111111111);
      dos.writeFloat(3.2f);
      dos.writeDouble(3.14);
      dos.writeUTF("�ڽ��� ������ �ٲ��� ���ϴ� ����� ���� ������ �ٲ� �� ����.");
      dos.flush();
      if(dos!=null) {   dos.close(); }
      //======������ �о���� ���
      file = new File("data.bin");
      fis=new FileInputStream(file);
      bis = new BufferedInputStream(fis);
      dis=new DataInputStream(bis);
      //���� ������� �о�;� �Ѵ�. �ݵ��..
      System.out.println(dis.readInt());
      System.out.println(dis.readShort());
      System.out.println(dis.readLong());
      System.out.println(dis.readFloat());
      System.out.println(dis.readDouble());
      System.out.println(dis.readUTF());
      if(dis!=null) { dis.close(); }
   }
}
