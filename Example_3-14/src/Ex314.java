import java.util.Scanner;
public class Ex314 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dividend;
		int divisor;
		
		System.out.print("나뉨수를 입력하시오: ");
		dividend = scan.nextInt();
		System.out.print("나뉫수를 입력하시오: ");
		divisor = scan.nextInt();
		System.out.println(dividend+"를 "+divisor+"로 나누면 몫은 "+dividend/divisor+"입니다.");
		scan.close();
	}

}
