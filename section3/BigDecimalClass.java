package section3;

import java.math.BigDecimal;

public class BigDecimalClass {

	public static void main(String[] args) {

		double x = 1.45;
		double y = 2.55;

		System.out.println(x);
		System.out.println(y);
		System.out.println(x + y);

		System.out.println();

		// issue
		x = 1.05;
		y = 2.55;
		System.out.println(x + y); // gives unexpected, wrong output

		// for ultra precison make use of BigDecimal class in Java

		BigDecimal d1 = new BigDecimal(1.05);
		BigDecimal d2 = new BigDecimal(2.55);

		System.out.println(d1.add(d2)); // this creates even more issue

		// to solve this use the String version of this number, if we do so then
		// rounding off will be disabled by default and we'll get the correct result

		BigDecimal big1 = new BigDecimal("1.05");
		BigDecimal big2 = new BigDecimal("2.55");

		System.out.println(big1.add(big2)); // gives correct output now

	}

}
