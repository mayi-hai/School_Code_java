package experiment7;

import java.util.Arrays;

public class UpSort {

	public static void main(String[] args) {
		 int[] a = { 5, 4, 9, 2, 7 };
		//����ǰ��
		 System.out.println("����ǰ:");
		 print(a);
		 Arrays.sort(a);
		 //�����
		 System.out.println("�����:");
		 print(a);
	}
	public static void print(int a[]) {
		for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
		}
		System.out.println();
		}

}
