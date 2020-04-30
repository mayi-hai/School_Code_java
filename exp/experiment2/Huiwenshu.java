package experiment2;

public class Huiwenshu {
	public static void main(String[] args) {
		int value = 12121;
		String s = String.valueOf(value);
		char[] c = s.toCharArray();
		for(int i=0,j=s.length()-1;i<j;i++,j--) {
			if(c[i]!=c[j]) {
				return false;
			}
		}
		return true;
	}
}
