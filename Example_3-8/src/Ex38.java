import java.util.Scanner;
public class Ex38 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		int sum=0;
		
		System.out.print("5���� ������ �Է��ϼ���>>");
		for(int i=0;i<5;i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		System.out.println("����� "+(double)sum/5);
	}

}
