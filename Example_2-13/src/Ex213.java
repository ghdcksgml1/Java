import java.util.Scanner;
public class Ex213 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100): ");
		int num_1 = scan.nextInt();
		System.out.print("학년을 입력하세요(1~4): ");
		int num_2 = scan.nextInt();
		
		if(num_1 >=60) {
			if(num_2 !=4)
				System.out.println("합격!");
			else if(num_1 >=70)
				System.out.println("합격!");
			else
				System.out.println("불합격!");
		}else {
			System.out.println("불합격!");
		}
		scan.close();
	}

}
