package chpater10.view_controll2;

import javafx.beans.property.SimpleStringProperty;

public class Phone {
	private SimpleStringProperty smartPhone; //심플스트링프로퍼티 = 객체 UI전용 스트링이라 생각.
	private SimpleStringProperty image;
	
	
	public Phone(String stringData1, String stringData2) {
		super();
		this.smartPhone=new SimpleStringProperty(stringData1);
		this.image = new SimpleStringProperty(stringData2);	
	}
	public void setSmartPhone (String value) {
		this.smartPhone.set(value);
	}
	public void setImage(String value) {
		this.image.set(value);
	}
	public String getSmartPhone() {
		return this.smartPhone.get();
	}
	public String getImage() {
		return this.image.get();
	}

	@Override
	public String toString() {
		return "Phone [smartPhone=" + smartPhone.get() + ", image=" + image.get() + "]";
	}
	
	
}
