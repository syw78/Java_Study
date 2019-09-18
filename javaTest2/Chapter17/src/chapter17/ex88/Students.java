package chapter17.ex88;

import java.io.Serializable;

public class Students implements Serializable {
	public int no;
	public String name;
	
	
	public Students(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Students [no=" + no + ", name=" + name + "]";
	}
}
