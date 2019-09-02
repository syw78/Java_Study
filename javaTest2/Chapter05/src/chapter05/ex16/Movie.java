package chapter05.ex16;

public class Movie {
	private String movieTitle;
	private double grade;
	private String director;
	private int year;
	
	public Movie() {
		movieTitle=null;
		grade=0.0;
		director=null;
		year=0;
	}
	
	public Movie(String movieTitle,double grade,String director,int year) {
		
		this.movieTitle=movieTitle;
		this.grade=grade;
		this.director=director;
		this.year=year;
	}
	
	public void moviePrint() {
		
		System.out.println("��ȭ���� :"+" "+movieTitle );
		System.out.println("���� :"+" "+grade);
		System.out.println("���� :"+" "+director);
		System.out.println("��ǥ���� :"+" "+year);
	}
	
}
