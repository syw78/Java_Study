package chapter17.copyfile2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterTest {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;

		try {
			fr = new FileReader("input.txt");
		} catch (FileNotFoundException e) {
		}

		try {
			fw = new FileWriter("output2");
		} catch (IOException e) {
		}

		int data;

		try {
			while ((data = fr.read()) != -1) {
				fw.write(data);
			}
		} catch (IOException e) {
		}
		if (fr != null) {
			try {
				fr.close();
			} catch (IOException e) {
			}
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
				
				}
			}
		}

	}
}