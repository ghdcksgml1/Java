import java.util.Scanner;
public class Ex215 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� Ŀ�� �帱���? ");
		String coffee = scan.next();
		int price=0;
		switch (coffee) {
			case "����������":
			case "īǪġ��":
			case "ī���":
				price = 3500;
				break;
			case "�Ƹ޸�ī��":
				price = 2000;
				break;
			default:System.out.println("�޴��� �����ϴ�.");
		}
		if(price!=0)System.out.println(coffee+"�� "+price+"���Դϴ�");
		scan.close();

	}

}
