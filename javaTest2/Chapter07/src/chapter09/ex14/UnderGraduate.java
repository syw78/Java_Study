package chapter09.ex14;

public class UnderGraduate extends Student {

	//1. 멤버변수 : 동아리
	private String club;

	public UnderGraduate() {
		this(null,0,null,0,0,null);
	}
	public UnderGraduate(String club) {
		this(null,0,null,0,0,club);
			
	}
	public UnderGraduate(String name, int number, String major, int grade, double score ,String club) {
		super(name, number, major, grade, score);
		this.club=club;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	@Override
	public String toString() {
		return "UnderGraduate [club=" + club + "]\n"+super.toString();
	}
}
