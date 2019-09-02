package chapter05.ex7;

public class Dog {
	private String breed;
	private int age;
	private String color;

	public Dog() {
		breed = null;
		age = 0;
		color = null;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void barking() {
		System.out.println(age + " 살짜리 " + color + breed + "는 짖습니다");
	}
	public void hungry() {
		System.out.println(age + " 살짜리 " + color + breed + "는 배고픕니다");
	}
	public void sleeping() {
		System.out.println(age + " 살짜리 " + color + breed + "는 졸립니다");
	}
}
