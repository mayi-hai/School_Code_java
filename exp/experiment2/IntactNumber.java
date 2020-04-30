package experiment2;

import java.util.Scanner;

public class IntactNumber {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int n = s.nextInt();
		int i = perfectNumberCheck(n);
		System.out.println(i);
	}

	public static int perfectNumberCheck(int n) {
		int flag = 0;
		int sum = 0;
		if (n >= 6) {
			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					sum += i;
				}
			}
			if(sum==n) {
				flag=1;
			}
		}
		return flag;

	}

}
