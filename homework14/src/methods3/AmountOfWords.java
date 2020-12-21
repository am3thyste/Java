package methods3;

import java.util.Scanner;

public class AmountOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String text = sc.nextLine();
		
		int amountOfWords = getWordsAmount(text);
		System.out.println("Amount of words in your text: " + amountOfWords);
	}

	private static int getWordsAmount(String text) {
		return text.split("\\s").length;
	}
}
