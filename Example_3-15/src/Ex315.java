import java.util.Scanner;
public class Ex315 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("�������� �Է��Ͻÿ�: ");
			int dividend = scan.nextInt();
			System.out.print("�������� �Է��Ͻÿ�: ");
			int divisor = scan.nextInt();
			try {
				System.out.println(dividend +"�� "+divisor + "�� ������ ���� "+dividend/divisor+"�Դϴ�.");
				break;
			}catch (ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�! �ٽ� �Է��ϼ���");
			}
		}
	}

}
