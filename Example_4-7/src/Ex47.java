import java.util.Scanner;
public class Ex47 {

	public static void main(String[] args) {
		Book book[] = new Book[2];
		
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<book.length;i++) {
			System.out.print("����>>");
			String title = scan.nextLine();
			System.out.print("����>>");
			String author = scan.nextLine();
			book[i] = new Book(title,author);
		}
		
		for(int i=0;i<book.length;i++) {
			System.out.print("("+book[i].title+", "+book[i].author + ")");
		}
		
		scan.close();

	}

}
