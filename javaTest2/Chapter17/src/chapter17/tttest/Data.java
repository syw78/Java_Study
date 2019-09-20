package chapter17.tttest;

import java.io.Serializable;

public class Data implements Serializable {
	public String name;
	public String address;
	public String birth;
	

	public Data(String name, String address, String birth) {
		super();
		this.name = name;
		this.address = address;
		this.birth = birth;
	}
	
	@Override
	public String toString() {
		return "Data [name=" + name + ", address=" + address + ", birth=" + birth + "]";
	}
	

}
