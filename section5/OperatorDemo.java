package section5;

public class OperatorDemo {

	public static void main(String[] args) {

		boolean value = !true;

		System.out.println(value);

		boolean n = !(4 > 5);

		System.out.println(n);

		boolean ternaryOperatorDemo = (5 > 4) ? true : false;

		System.out.println(ternaryOperatorDemo);
		
		int a=3;
	    a=a++;
	    System.out.println("Post-Increment a: " +a);
	 
	    a=++a;
	    System.out.println("Pre-Increment a: "+a );
	 
	    a=a--;
	    System.out.println("Post-Decrement a: " +a);
	 
	    a=--a;
	    System.out.println("Pre-Decrement a: "+a );

	}
}
