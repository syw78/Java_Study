package chapter15.maptest;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Map.Entry;

import chapter15.comparable.MyArrayAlg;
import chapter15.comparable.MyClass;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, Student> ma= new HashMap<String, Student>();
		
		ma.put("123", new Student(1,"Á¨Àå"));
		ma.put("1234", new Student(2,"2Á¨Àå"));
		ma.put("1235", new Student(3,"3Á¨Àå"));
		
		 // Å°¶û ¹ë·ù¸¦ ¼Â ÇüÅÂ·Î ³ª´²ÁÖ´Â ¿ªÇÒÀ» ÇØÁÜ
		
		for(Entry<String, Student> aa :ma.entrySet()) {
			String str=aa.getKey();
			Student st= aa.getValue();
			System.out.println(str);
			System.out.println(st);
			}
		
		Student[] arr = {ma.get("123"),ma.get("1234"),ma.get("1235"),};
		Student largeObject= MyArrayAlg.getMax(arr);
		System.out.println(largeObject+"°¡ÀåÅ«°´Ã¼ÀÔ´Ï´Ù.");
		
		
		
		}
		
	}


