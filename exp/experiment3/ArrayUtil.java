package experiment3;

public class ArrayUtil {

	public static void main(String[] args) {
		int array[]= { 12,23,456,222,768,93245};
		int max,min;
		max=min=array[0];
		for(int i=0;i<array.length;i++) {
			if(max<array[i])
				max=array[i];
			if(min>array[i])
				min=array[i];
		}
		System.out.println("最大数 = "+max);
		System.out.println("最小数 = "+min);
	}
}
