package experiment7;


//  import java.util.ArrayList; import java.util.List;
//  
//  //泛型：类型参数化，称之为"形式类型参数" //1.泛型类：定义了泛型的类 //2.泛型接口：定义了泛型的接口 //3.泛型方法；定义了泛型的方法
//  //T,S,K,V,E。。。
//  
//  class SaddlePoint<T> { private int rownum; private int colnum; private T
//  value;
//  
//  public SaddlePoint(int rownum, int colnum, T value) { super(); this.rownum =
//  rownum; this.colnum = colnum; this.value = value; }
//  
//  public int getRownum() { return rownum; }
//  
//  public void setRownum(int rownum) { this.rownum = rownum; }
//  
//  public int getColnum() { return colnum; }
//  
//  public void setColnum(int colnum) { this.colnum = colnum; }
//  
//  public T getValue() { return value; }
//  
//  public void setValue(T value) { this.value = value; } }
//  
//  //Matrix就是一个泛型类 public class Matrix<T extends Number> { private T[][] data;
//  
//  public Matrix() { super(); }
//  
//  public Matrix(T[][] data) { super(); this.data = data; }
//  
//  //转置 public Matrix<Number> transpose(){ Number[][] dn = new
//  Number[data[0].length][data.length]; for(int i = 0;i < data.length;i++) {
//  for(int j = 0;j< data[i].length;j++) { dn[j][i] = data[i][j]; } }
//  Matrix<Number> m = new Matrix<>(dn); return m; }
//  
//  //相加 public Matrix<T> add(Matrix<T> matrix){ //... return matrix; }
//  
//  //将矩阵转换为向量 public T[] matrix2Vector() { //... return null; }
//  
//  //鞍点 public List<SaddlePoint> findSaddlePoints(){ List<SaddlePoint> list =
//  new ArrayList<SaddlePoint>();
//  
//  return list; }
//  
//  }
 
import java.util.Random;

public class Matrix {

	public Matrix() {
		// TODO Auto-generated constructor stub
		row = 2 + (int) (Math.random() * (8 - 2 + 1));// 行数和列数范围2<=num<=8
		column = 2 + (int) (Math.random() * (8 - 2 + 1));
		matrix = new int[row][column];
		Random random = new Random();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = random.nextInt(100);
			}
		}
	}

	public Matrix(Matrix m) {
		row = m.row;
		column = m.column;
		matrix = m.matrix;
	}

	public Matrix(int r, int c) {
		row = r;
		column = c;
		matrix = new int[row][column];
		Random random = new Random();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = random.nextInt(100);
			}
		}
	}

	private int row;// 行数
	private int column;// 列数
	private int matrix[][];// 定义矩阵
	// 矩阵转置

	protected void transposition() {
		Matrix m1 = new Matrix(this);
		int Matrix[][] = new int[m1.row][m1.column];
		for (int i = 0; i < m1.row; i++) {
			for (int j = 0; j < m1.column; j++) {
				Matrix[i][j] = m1.matrix[m1.row - i - 1][m1.column - j - 1];
			}
		}
		m1.matrix = Matrix;
		System.out.println("转置后的矩阵为:");
		m1.display();
	}

	// 矩阵相加
	protected void matrixAdd() {
		Matrix m2 = new Matrix();
		Matrix m3 = new Matrix(m2.row, m2.column);
		System.out.println("两矩阵相加 ");
		System.out.println("第一个矩阵为:");
		m2.display();
		System.out.println("第二个矩阵为:");
		m3.display();
		System.out.println("相加得:");
		for (int i = 0; i < m2.row; i++) {
			for (int j = 0; j < m2.column; j++) {
				m2.matrix[i][j] = m2.matrix[i][j] + m3.matrix[i][j];
			}
		}
		m2.display();

	}

	// 找矩阵鞍点
	protected void saddlePoint() {
		Matrix m1 = new Matrix(this);
		int sp = m1.matrix[0][0];// 鞍点(行最大值)
		int min = m1.matrix[0][0];// 列最小值
		int count = 0;// 鞍点个数
		int capture_i = 0, capture_j = 0;// 用于捕获鞍点位置
		for (int i = 0; i < m1.row; i++) {
			for (int j = 0; j < m1.column; j++) {
				if (m1.matrix[i][j] >= sp) {
					sp = m1.matrix[i][j];
					capture_j = j;
					capture_i = i;
				}

			}
			for (int n = 0; n < m1.row; n++) {
				if (min > m1.matrix[n][capture_j]) {
					min = m1.matrix[n][capture_j];
				}
			}
			if (sp == min) {
				System.out.println("鞍点为:" + sp + " 坐标为:(" + capture_i + "," + capture_j + ")");
				++count;
			}

		}
		if (count == 0) {
			System.out.println("此矩阵无鞍点!");
		}
	}

	// 矩阵存储
	protected void storage() {
		Matrix m = new Matrix(this);
		int[] columnArray = new int[m.column * m.row];
		int[] rowArray = new int[m.column * m.row];
		int r = 0, c = 0;
		// 按行
		for (int i = 0; i < m.row; i++) {
			for (int j = 0; j < m.column; j++, r++) {
				rowArray[r] = m.matrix[i][j];
			}
		}
		System.out.println("按行存储: ");
		for (int i = 0; i < rowArray.length; i++) {
			System.out.print(rowArray[i] + " ");
		}
		System.out.println();
		// 按列
		for (int i = 0; i < m.column; i++) {
			for (int j = 0; j < m.row; j++, c++) {
				columnArray[c] = m.matrix[j][i];
			}
		}
		System.out.println("按列存储: ");
		for (int i = 0; i < columnArray.length; i++) {
			System.out.print(columnArray[i] + " ");
		}
		System.out.println();
	}

	// 打印矩阵
	protected void display() {
		Matrix m1 = new Matrix(this);
		for (int i = 0; i < m1.row; i++) {
			for (int j = 0; j < m1.column; j++) {
				System.out.print(m1.matrix[i][j] + "    ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix matrix = new Matrix();// 初始化一个矩阵
		matrix.display();// 打印矩阵matrix
		matrix.saddlePoint();// 打印matrix的鞍点
		matrix.storage();// 将matrix矩阵存储
		matrix.transposition();// 将matrix转置
		matrix.matrixAdd();// 矩阵相加
	}
}
