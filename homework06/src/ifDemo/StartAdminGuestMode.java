package ifDemo;

import java.util.Scanner;

public class StartAdminGuestMode {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, select either 'ADMIN' or 'GUEST' mode for this program");
		String userChoice = scanner.next();
		if (userChoice.equalsIgnoreCase("admin")) {
			System.out.println("You started program in admin mode.");
		}
		else {
			System.out.println("You started program in guest mode.");
		}	
		scanner.close();
	}
}
