import java.util.Scanner;
public class Ex42 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("width : ");
		int width = scan.nextInt();
		System.out.print("height : ");
		int height = scan.nextInt();
		
		Rectangle rect = new Rectangle(width,height);
		System.out.println("¸éÀû = "+rect.getArea());

	}

}
