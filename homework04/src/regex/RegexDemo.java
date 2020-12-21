package regex;

import java.util.Formatter;

public class RegexDemo {

	public static void main(String[] args) {
		Formatter formatter;
		for (int i = 2; i < 7; i++) {
			formatter = new Formatter();
			formatter.format("%." + i + "g", Math.PI);
			System.out.println(formatter);
		}
	}

}
