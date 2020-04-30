package experiment3;

public class PyramidDemo {

	public static void main(String[] args) {
		Pyramid pyramid = new Pyramid();
		pyramid.setPattern('*');
		pyramid.setHeight(6);
		Pyramid.draw();
	}

}
