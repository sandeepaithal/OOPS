package compiletimepolymorphism;

/**
 * A calculator class demonstrating compile-time polymorphism through method
 * overloading. Provides methods to add integers and doubles with different
 * numbers of parameters.
 * 
 * @author C Sandeep Aithal
 */
public class Calculator {

	/**
	 * Adds two integers.
	 */
	public int add(int a, int b) {
		return a + b;
	}

	/**
	 * Adds three integers.
	 */
	public int add(int a, int b, int c) {
		return a + b + c;
	}

	/**
	 * Adds two doubles.
	 */
	public double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		Calculator c1 = new Calculator();

		// Adding two integers
		int sum1 = c1.add(10, 20);
		System.out.println(sum1);

		// Adding three integers
		int sum2 = c1.add(10, 25, 78);
		System.out.println(sum2);

		// Adding two doubles
		double sum3 = c1.add(12.75, 7.25);
		System.out.println(sum3);
	}
}
