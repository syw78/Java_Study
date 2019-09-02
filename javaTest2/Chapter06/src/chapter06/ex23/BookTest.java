package chapter06.ex23;

public class BookTest {

	public static void main(String[] args) {
		Book book= new Book();
	book.setTitle("반지의 제왕 왕의 귀환");
	book.setAuthor("John Ronald Reuel Tolkien");
	
	System.out.println("제목 = "+book.getTitle());
	System.out.println("저자 = "+book.getAuthor());
	}

}
