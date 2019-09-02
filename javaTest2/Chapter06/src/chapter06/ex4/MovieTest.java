package chapter06.ex4;

public class MovieTest {

	public static void main(String[] args) {
		Movie movie = new Movie();
		
		movie.setTitle("Transformer");
		movie.setDirector("Michael Bay");
		movie.setActors("Megan Fox");
		
		System.out.println("Title="+" "+movie.getTitle());
		System.out.println("Director="+" "+movie.getDirector());
		System.out.println("Actors="+" "+movie.getActors());
	}

}
