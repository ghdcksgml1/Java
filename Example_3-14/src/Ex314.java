import java.util.Scanner;
public class Ex314 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dividend;
		int divisor;
		
		System.out.print("�������� �Է��Ͻÿ�: ");
		dividend = scan.nextInt();
		System.out.print("�������� �Է��Ͻÿ�: ");
		divisor = scan.nextInt();
		System.out.println(dividend+"�� "+divisor+"�� ������ ���� "+dividend/divisor+"�Դϴ�.");
		scan.close();
	}

}
