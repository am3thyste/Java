package loops2;

import java.util.Scanner;

public class PyramidInConsole {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please, enter height of the pyramid: ");
		int pyramidHeight = scanner.nextInt();
		scanner.close();
		
		for (int i = 0; i < pyramidHeight; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
		for(int i = pyramidHeight-1; i>0; i-- ) {
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

}
