package chapter06.ex23;

public class BookTest {

	public static void main(String[] args) {
		Book book= new Book();
	book.setTitle("������ ���� ���� ��ȯ");
	book.setAuthor("John Ronald Reuel Tolkien");
	
	System.out.println("���� = "+book.getTitle());
	System.out.println("���� = "+book.getAuthor());
	}

}
