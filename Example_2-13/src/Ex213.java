import java.util.Scanner;
public class Ex213 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���(0~100): ");
		int num_1 = scan.nextInt();
		System.out.print("�г��� �Է��ϼ���(1~4): ");
		int num_2 = scan.nextInt();
		
		if(num_1 >=60) {
			if(num_2 !=4)
				System.out.println("�հ�!");
			else if(num_1 >=70)
				System.out.println("�հ�!");
			else
				System.out.println("���հ�!");
		}else {
			System.out.println("���հ�!");
		}
		scan.close();
	}

}
