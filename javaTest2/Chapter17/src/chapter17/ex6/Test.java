package chapter17.ex6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		FileOutputStream fo = new FileOutputStream("car.obj");
		ObjectOutputStream oos= new ObjectOutputStream(fo);
		
		
		Car car = new Car();
		oos.writeObject(car);
		
		FileInputStream fi = new FileInputStream("car.obj");
		ObjectInputStream ois = new ObjectInputStream(fi);
		Object obj=ois.readObject();
		System.out.println((Car)obj);
		
	}

}
