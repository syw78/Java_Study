package chapter06.ex4;

public class Movie {
	private String title;
	private String director;
	private String actors;

	public Movie() {
		title = null;
		director = null;
		actors = null;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}

}
