package chapter06.ex32;

public class Movie {

	private String title;
	private String director;
	private String company;
	
	public Movie() {
		
		this(null,null,null);
	}
	public Movie(String title,String director,String company) {
		this.title=title;
		this.director=director;
		this.company=company;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", director=" + director + ", company=" + company + "]";
	}
}
