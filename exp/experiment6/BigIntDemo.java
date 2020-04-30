package experiment6;

public class BigIntDemo {

	public static void main(String[] args) {
		BigInt big = new BigInt("12453456", "9876543219", "19981014");
		big.add();
		big.cut();
		big.multiply();
		big.divide();
		big.factorCount();
	}

}
