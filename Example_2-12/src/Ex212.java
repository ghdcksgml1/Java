import java.util.Scanner;
public class Ex212 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���(0~100): ");
		int number = scanner.nextInt();
		char grade;
		if(number >= 90)
			grade = 'A';
		else if(number >=80)
			grade = 'B';
		else if(number >=70)
			grade = 'C';
		else if(number >=60)
			grade = 'D';
		else
			grade = 'F';
		System.out.println("������ " + grade + "�Դϴ�. ");
		
		scanner.close();
	}
}
