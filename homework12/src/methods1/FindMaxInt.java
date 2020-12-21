package methods1;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");
		String userInput = sc.nextLine();
		
		String[] userInputStrArr = userInput.split("\\s");
		int length = userInputStrArr.length;
		int[] intArray = new int[length];
		for (int i = 0; i<length; i++) {
			intArray[i] = Integer.parseInt(userInputStrArr[i]);
		}
		System.out.println("*** Initial Array ***");
		System.out.println(Arrays.toString(intArray));
		System.out.println("*** Max number in array ***");
		
		int maxInt = findMaxIntInArray(intArray);
		System.out.println(maxInt);
		sc.close();
	}

	
	public static int findMaxIntInArray(int[] intArray) {
		int maxInt = 0;
		for (int i =0; i < intArray.length; i++) {
			if (intArray[i] > maxInt)
			{
				maxInt = intArray[i];
			}
		}
		return maxInt;
	}
}

//solution udemy:
/*
public class FindMaxInt {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Please, enter integer numbers separated by space: ");
	String numbers = sc.nextLine();
	int[] intArray = convertStringArrayToIntArray(numbers.split("\\s+"));
	int maxInt = findMaxIntInArray(intArray);
	System.out.println("*** Initial Array ***");
	System.out.println(Arrays.toString(intArray));
	System.out.println("*** Max number in array ***");
	System.out.println(maxInt);
}


public static int findMaxIntInArray(int[] intArray) {
	int max = intArray[0];
	for (int i : intArray) {
		if (i > max) {
			max = i;
		}
	}
	return max;
}

private static int[] convertStringArrayToIntArray(String[] stringArray) {
	int[] intArray = new int[stringArray.length];
	for (int i = 0; i < stringArray.length; i++) {
		intArray[i] = Integer.valueOf(stringArray[i]);
	}
	return intArray;
}

// ====================== SOLUTION WITH STREAM API

public static int findMaxIntInArrayStreamApi(int[] intArray) {
	return Arrays.stream(intArray).max().getAsInt();
}

private static int[] convertStringArrayToIntArrayStreamApi(String[] stringArray) {
	return Arrays.stream(stringArray)
			.mapToInt(s -> Integer.valueOf(s))
			.toArray();
}

}*/