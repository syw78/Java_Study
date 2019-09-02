package chapter09.ex14;

public class Graduate extends Student{
	private static String[] defaultType = {"교육조교","연구조교"};
	//1. 멤버변수 : 조교유형(교육조교 연구조교) ,장학금비율
	private String assistType;
	private double scholarshipRate;
	//2. 생성자 : 매개변수있는 생성자(이름,학번,소속학과,학년,이수학점,죠교유형 , 장학금비율)
	public Graduate(String assistType, double scholarshipRate) {
		this(null,0,null,0,0,assistType,scholarshipRate);
	}
	public Graduate(String name, int number, String major, int grade, double score,String assistType, double scholarshipRate) {
		super(name, number, major, grade, score);
		
		int returnValue=1;
		this.assistType="교육조교";
		
		for(int i=0;i<defaultType.length;i++) {
			returnValue=assistType.compareTo(defaultType[i]);
			if(returnValue==0) {this.assistType=assistType; break;}
			
		}
		if(scholarshipRate>=0.0&&scholarshipRate<1.0) {
			this.scholarshipRate=scholarshipRate;
		}
	}
	public String getAssistType() {
		return assistType;
	}
	public void setAssistType(String assistType) {
		this.assistType = assistType;
	}
	public double getScholarshipRate() {
		return scholarshipRate;
	}
	public void setScholarshipRate(double scholarshipRate) {
		this.scholarshipRate = scholarshipRate;
	}
	@Override
	public String toString() {
		return "Graduate [assistType=" + assistType + ", scholarshipRate=" + scholarshipRate + "]\n"+super.toString();
	}
	
	
}
