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
      //파일을 읽어오는 클래스 정의
      FileInputStream fis=null; BufferedInputStream bis=null; DataInputStream dis=null; File file=null;
      //파일에 저장하는 클래스 정의
      FileOutputStream fos=null; BufferedOutputStream bos=null; DataOutputStream dos=null; File file2=null;
      //======파일에 저장하는 기능
      file2=new File("data.bin");
      fos=new FileOutputStream(file2);
      bos=new BufferedOutputStream(fos);
      dos=new DataOutputStream(bos);
      dos.writeInt(100);
      dos.writeShort(20);
      dos.writeLong(1111111111);
      dos.writeFloat(3.2f);
      dos.writeDouble(3.14);
      dos.writeUTF("자신의 생각을 바꾸지 못하는 사람은 결코 현실을 바꿀 수 없다.");
      dos.flush();
      if(dos!=null) {   dos.close(); }
      //======파일을 읽어오는 기능
      file = new File("data.bin");
      fis=new FileInputStream(file);
      bis = new BufferedInputStream(fis);
      dis=new DataInputStream(bis);
      //써진 순서대로 읽어와야 한다. 반드시..
      System.out.println(dis.readInt());
      System.out.println(dis.readShort());
      System.out.println(dis.readLong());
      System.out.println(dis.readFloat());
      System.out.println(dis.readDouble());
      System.out.println(dis.readUTF());
      if(dis!=null) { dis.close(); }
   }
}
