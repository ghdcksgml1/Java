import java.util.Vector;
public class Ex71 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		
		v.add(2,100);
		
		System.out.println("���� ���� ��� ��ü �� : "+ v.size());
		System.out.println("������ ���� �뷮 : "+v.capacity());
		
		int sum = 0;
		for(int i=0;i<v.size();i++) {
			sum += v.get(i);
		}
		System.out.println("���Ϳ� �ִ� ���� �� : "+sum);

	}

}
