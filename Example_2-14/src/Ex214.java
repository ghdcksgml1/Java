import java.util.Scanner;
public class Ex214 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���(0~100): ");
		int score = scan.nextInt();
		char grade;
		switch (score/10) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
		}
		System.out.println("������ "+grade + "�Դϴ�");
		
		scan.close();
	}

}
