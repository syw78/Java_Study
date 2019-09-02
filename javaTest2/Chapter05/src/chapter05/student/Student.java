package chapter05.student;

public class Student {
	private String name;
	private int number;
	private String gender;
	private int score;
	
	public Student() {
		name=null;
		number=0;
		gender=null;
		score=0;
	}
	
	public Student(String name, int number, String gender, int score) {
		this.name=name;
		this.number=number;
		this.gender=gender;
		this.score=score;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setNumber(int number) {
		this.number=number;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public void setScore(int score) {
		this.score=score;
	}
	
	public String getName() {
		return name;
	}
	public int getNumber() {
		return number;
	}
	public String getGender() {
		return gender;
	}
	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", gender=" + gender + ", score=" + score + "]";
	}
	public void nameScorePrint() {
		System.out.println("이름="+name);
		System.out.println("점수="+score);
	}
}
