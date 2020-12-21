package enumerations;

import java.util.Scanner;

public class DemoEnum {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Please, enter message type to check its priority: ");
			String userInput = sc.next();

			if (isValidMessageType(userInput)) {
				String priorityType = MessageType.valueOf(userInput).getPriority().toString();
				System.out.println(priorityType);
				break;
			} else {
				System.out.println("Please, enter valid "
						+ "message type. Only 'A', 'B', 'C' or 'D' are allowed");
				continue;
			}

		}
		
		sc.close();

	}

	private static boolean isValidMessageType(String userInput) {
		if (userInput.equals(MessageType.A.toString()) || 
			userInput.equals(MessageType.B.toString()) ||
			userInput.equals(MessageType.C.toString()) || 
			userInput.equals(MessageType.D.toString()))
				return true;
		else {
			return false;
		}
	}

}


