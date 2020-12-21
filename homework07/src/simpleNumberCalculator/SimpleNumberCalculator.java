package simpleNumberCalculator;

public class SimpleNumberCalculator {

	public static void main(String[] args) {
		if (args[0].matches("\\d[\\.,]\\d") || args[1].matches("\\d[\\.,]\\d")) {
			System.out.println("floating point number");
			Double sumDouble = Double.parseDouble(args[0]) + Double.parseDouble(args[1]);
			System.out.println(sumDouble);
		}
		else {
			System.out.println("integer numbers");
			int sumInt = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
			System.out.println(sumInt);
		}

	}
}
