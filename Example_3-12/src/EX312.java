
public class EX312 {
	static int[] makeArray() {
		int temp[] = new int [5];
		for(int i=0;i<temp.length;i++) {
			temp[i] =i;
		}
		return temp;
	}
	public static void main(String[] args) {
		int intArray[];
		intArray = makeArray();
		for(int k : intArray) {
			System.out.print(k+" ");
		}

	}

}
