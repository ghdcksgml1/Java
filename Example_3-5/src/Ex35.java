import java.util.Scanner;
public class Ex35 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int sum = 0;
		for(int i=0;i<5;i++) {
			n = scan.nextInt();
			if(n>0) {
				sum+=n;
			}else {
				continue;
			}
		}
		System.out.println(sum);

	}

}
