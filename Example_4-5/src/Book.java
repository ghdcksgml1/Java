
public class Book {
	String title;
	String author;

	void show() {
		System.out.println(title + " "+author);
	}
	
	protected Book() {
		this("","");
		System.out.println("������ ȣ���");
	}
	
	public Book(String title) {
		this(title,"���� �̻�");
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}
