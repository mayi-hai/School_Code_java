package experiment7;


//  import java.util.ArrayList; import java.util.List;
//  
//  //���ͣ����Ͳ���������֮Ϊ"��ʽ���Ͳ���" //1.�����ࣺ�����˷��͵��� //2.���ͽӿڣ������˷��͵Ľӿ� //3.���ͷ����������˷��͵ķ���
//  //T,S,K,V,E������
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
//  //Matrix����һ�������� public class Matrix<T extends Number> { private T[][] data;
//  
//  public Matrix() { super(); }
//  
//  public Matrix(T[][] data) { super(); this.data = data; }
//  
//  //ת�� public Matrix<Number> transpose(){ Number[][] dn = new
//  Number[data[0].length][data.length]; for(int i = 0;i < data.length;i++) {
//  for(int j = 0;j< data[i].length;j++) { dn[j][i] = data[i][j]; } }
//  Matrix<Number> m = new Matrix<>(dn); return m; }
//  
//  //��� public Matrix<T> add(Matrix<T> matrix){ //... return matrix; }
//  
//  //������ת��Ϊ���� public T[] matrix2Vector() { //... return null; }
//  
//  //���� public List<SaddlePoint> findSaddlePoints(){ List<SaddlePoint> list =
//  new ArrayList<SaddlePoint>();
//  
//  return list; }
//  
//  }
 
import java.util.Random;

public class Matrix {

	public Matrix() {
		// TODO Auto-generated constructor stub
		row = 2 + (int) (Math.random() * (8 - 2 + 1));// ������������Χ2<=num<=8
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

	private int row;// ����
	private int column;// ����
	private int matrix[][];// �������
	// ����ת��

	protected void transposition() {
		Matrix m1 = new Matrix(this);
		int Matrix[][] = new int[m1.row][m1.column];
		for (int i = 0; i < m1.row; i++) {
			for (int j = 0; j < m1.column; j++) {
				Matrix[i][j] = m1.matrix[m1.row - i - 1][m1.column - j - 1];
			}
		}
		m1.matrix = Matrix;
		System.out.println("ת�ú�ľ���Ϊ:");
		m1.display();
	}

	// �������
	protected void matrixAdd() {
		Matrix m2 = new Matrix();
		Matrix m3 = new Matrix(m2.row, m2.column);
		System.out.println("��������� ");
		System.out.println("��һ������Ϊ:");
		m2.display();
		System.out.println("�ڶ�������Ϊ:");
		m3.display();
		System.out.println("��ӵ�:");
		for (int i = 0; i < m2.row; i++) {
			for (int j = 0; j < m2.column; j++) {
				m2.matrix[i][j] = m2.matrix[i][j] + m3.matrix[i][j];
			}
		}
		m2.display();

	}

	// �Ҿ��󰰵�
	protected void saddlePoint() {
		Matrix m1 = new Matrix(this);
		int sp = m1.matrix[0][0];// ����(�����ֵ)
		int min = m1.matrix[0][0];// ����Сֵ
		int count = 0;// �������
		int capture_i = 0, capture_j = 0;// ���ڲ��񰰵�λ��
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
				System.out.println("����Ϊ:" + sp + " ����Ϊ:(" + capture_i + "," + capture_j + ")");
				++count;
			}

		}
		if (count == 0) {
			System.out.println("�˾����ް���!");
		}
	}

	// ����洢
	protected void storage() {
		Matrix m = new Matrix(this);
		int[] columnArray = new int[m.column * m.row];
		int[] rowArray = new int[m.column * m.row];
		int r = 0, c = 0;
		// ����
		for (int i = 0; i < m.row; i++) {
			for (int j = 0; j < m.column; j++, r++) {
				rowArray[r] = m.matrix[i][j];
			}
		}
		System.out.println("���д洢: ");
		for (int i = 0; i < rowArray.length; i++) {
			System.out.print(rowArray[i] + " ");
		}
		System.out.println();
		// ����
		for (int i = 0; i < m.column; i++) {
			for (int j = 0; j < m.row; j++, c++) {
				columnArray[c] = m.matrix[j][i];
			}
		}
		System.out.println("���д洢: ");
		for (int i = 0; i < columnArray.length; i++) {
			System.out.print(columnArray[i] + " ");
		}
		System.out.println();
	}

	// ��ӡ����
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
		Matrix matrix = new Matrix();// ��ʼ��һ������
		matrix.display();// ��ӡ����matrix
		matrix.saddlePoint();// ��ӡmatrix�İ���
		matrix.storage();// ��matrix����洢
		matrix.transposition();// ��matrixת��
		matrix.matrixAdd();// �������
	}
}
