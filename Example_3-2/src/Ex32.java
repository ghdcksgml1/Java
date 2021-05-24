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
		System.out.println("정수의 개수는 "+cnt + "개이며 평균은 "+avg/cnt+"입니다.");
	}

}
