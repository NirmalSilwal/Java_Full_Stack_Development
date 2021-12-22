package section3;

import java.math.BigDecimal;

public class testing {

	public static void main(String[] args) {

		BigDecimal bd1 = new BigDecimal(1.05);
		BigDecimal bd2 = new BigDecimal(2.55);

		System.out.println(bd1.add(bd2));

		BigDecimal d1 = new BigDecimal("1.05");
		BigDecimal d2 = new BigDecimal("2.55");

		System.out.println(d1.add(d2));
	}
}
