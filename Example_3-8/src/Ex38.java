import java.util.Scanner;
public class Ex38 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		int sum=0;
		
		System.out.print("5개의 정수를 입력하세요>>");
		for(int i=0;i<5;i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		System.out.println("평균은 "+(double)sum/5);
	}

}
