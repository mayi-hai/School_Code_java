package experiment6;

import java.math.BigInteger;

public class BigInt {
	BigInteger m1;
	BigInteger m2;
	BigInteger m3;
	BigInteger m4;

	BigInt(String s1, String s2, String s4) {
		m1 = new BigInteger(s1);
		m2 = new BigInteger(s2);
		m4 = new BigInteger(s4);
	}

	public void add() {
		m3 = m1.add(m2);
		System.out.println("两个数的和为：" + m3);
	}

	public void cut() {
		m3 = m1.subtract(m2);
		System.out.println("两个数的差为：" + m3);
	}

	public void multiply() {
		m3 = m1.multiply(m2);
		System.out.println("两个数的积为：" + m3);
	}

	public void divide() {
		m3 = m1.divide(m2);
		System.out.println("两个数的商为：" + m3);
	}

	public void factorCount() {
		int count = 0;
		for (BigInteger i = BigInteger.valueOf(2); i.compareTo(m4) < 0; i = i.add(BigInteger.ONE)) {
			if (m4.remainder(i).equals(BigInteger.ZERO)) {
				++count;
			}
			
		}
		System.out.println(m4 + "的因子个数为：" + count);
	}

}
