import java.util.Scanner;
public class Ex32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt =0;
		double avg = 0;
		int n = scan.nextInt();
		while(n != -1) {
			cnt++;
			avg += n;
			n = scan.nextInt();
		}
		System.out.println("������ ������ "+cnt + "���̸� ����� "+avg/cnt+"�Դϴ�.");
	}

}
