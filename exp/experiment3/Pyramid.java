package experiment3;

public class Pyramid {

	
	private static char pattern;
	private static int height;
	
	public void setPattern(char pattern) {
		Pyramid.pattern=pattern;
	}
	
	public void setHeight(int height) {
		Pyramid.height=height;
	}
	
	public static void draw() {
		
		for(int i=1;i<=height;i++) {
			for(int j=1;j<=height-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(pattern);
			}
			System.out.println();
		}
	}
}
