import java.util.Scanner;
public class Ex36 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = "";
		
		while(true) {
			System.out.print(">>");
			name = scan.nextLine();
			if(name.equals("exit")) {
				System.out.println("�����մϴ�...");
				break;
			}
		}

	}

}
