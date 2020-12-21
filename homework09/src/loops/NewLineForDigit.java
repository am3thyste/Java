package loops;

import java.util.Scanner;

public class NewLineForDigit {

	public static void main(String[] args) {
		System.out.print("Please, enter any integer: ");
		Scanner sc = new Scanner(System.in);
		String userNumberString = sc.next();
		
//		int userNumber = sc.nextInt();
//
//		String userNumberString = String.valueOf(userNumber);
		
		for (char digit : userNumberString.toCharArray()) {
			System.out.println(digit);
		}
//		char[] userNumberArr = userNumberString.toCharArray();
//		int length = userNumberArr.length;
//
//		for (int i = 0; i < length; i++) {
//			System.out.println(userNumberArr[i]);
//		}
		sc.close();

	}

}
