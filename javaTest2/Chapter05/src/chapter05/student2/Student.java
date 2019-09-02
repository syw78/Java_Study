package chapter05.student2;

public class Student {
	//멤버변수
	//생성자함수
	//멤버함수.
	private String name;
	private int no;
	private String gender;
	private int score;
	
	public Student() {
		this.name=null;
		this.no=0;
		this.gender=null;
		this.score=0;
	}
	public Student(String name , int no , String gender, int score) {
		this.name=name;
		this.no=no;
		this.gender=gender;
		this.score=score;
	}
	
	// getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", no=" + no + ", gender=" + gender + ", score=" + score + "]";
	}
	public void printNameScore() {
		System.out.println("이름="+this.name+"점수="+this.score);
	}
}
	

	
	
