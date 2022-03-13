package section3;

public class StringDemo {

	public static void main(String[] args) {

		String s1 = "10";
		String s2 = "20";

		System.out.println(s1 + s2); // here + plus is a overloaded operator and will concatenate two variable

		int var = 10;
		String var2 = "2";

		System.out.println(var + var2);
		System.out.println(var + 20);

		System.out.println(10 + 20 + "hi");
		System.out.println(10 + "hi" + 20);

		String str = new String("hello world"); // proper way of declaring String in Java
		System.out.println(str);
		
		// String is a class
	}

}
