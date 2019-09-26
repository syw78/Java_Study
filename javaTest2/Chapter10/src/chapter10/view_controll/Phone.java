package chapter10.view_controll;

import java.util.Set;

import javafx.beans.property.SimpleStringProperty;

public class Phone {
	private SimpleStringProperty smartPhone; //유아이에만 적용되는 클래스? 문자열이 바뀌는 속성값?
	private SimpleStringProperty image;
	
	
	public Phone(String smartPhone, String image) {
		super();
		this.smartPhone = new SimpleStringProperty(smartPhone);
		this.image = new SimpleStringProperty(image);
		
	}
	public String getSmartPhone() {
		return smartPhone.get();
	}
	public void setSmartPhone(String smartPhone) {
		this.smartPhone.set(smartPhone);
	}
	public String getImage() {
		return image.get();
	}
	public void setImage(String image) {
		this.image.set(image);
	}
	
	@Override
	public String toString() {
		return "Phone [smartPhone=" + smartPhone.get() + ", image=" + image.get() + "]";
	}
	
	
	
}
