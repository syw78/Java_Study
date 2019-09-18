package chapter17.test;

import java.io.Serializable;

public class Data implements Serializable {
	public String address;
	public String birth;
	public  String name;
	
	public Data(String address, String birth, String name) {
		super();
		this.address = address;
		this.birth = birth;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Data [address=" + address + ", birth=" + birth + ", name=" + name + "]";
	}
	
}
