package experiment3;

public class SumArray {
	public static void main(String[] args) {
	int array[]= {12, 23, 456, 222, 768, 93245};
	int sum = 0;
	for(int i=0;i<array.length;i++) {
		sum+=array[i];
	}
	System.out.println(sum);
	}
}
