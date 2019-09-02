package chapter06.ex32;

public class MovieTest {

	public static void main(String[] args) {
		Movie movie= new Movie();
		Movie movie2= new Movie("Hulk","ÀÌ¾È","USA");
		
		System.out.println(movie.toString());
		System.out.println(movie2.toString());
	}

}
