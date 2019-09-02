package chapter09.ex14;

public class Student {
	//1.멤버변수 :이름,학번,소속학과,학년,이수학점\
	private String name;
	private int number;
	private String major;
	private int grade;
	private double score;
	//2.생성자(매개밴셔있는생성자)

	public Student() {
		this(null,0,null,0,0.0);
	}
	public Student(String name,int number) {
		this(name,number,null,0,0.0);
	}
	public Student(String name, int number, String major, int grade, double score) {
		super();
		this.name = name;
		this.number = number;
		this.major = major;
		this.grade = grade;
		this.score = score;
	}
	//3.함수 : getter,setter , toStirng
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", major=" + major + ", grade=" + grade + ", score="
				+ score + "]";
	}


	
}
