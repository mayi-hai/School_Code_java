package experiment7;

public class CopyArray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] b = new int[a.length];
		
		// forѭ������
		System.out.println("forѭ������������BΪ:");
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		printArray(b);
		
		//API����
		System.out.println("API����������BΪ:");
		b = new int[5];
		System.arraycopy(a, 2, b, 0, 5);
		printArray(b);
		}

	public static void printArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
