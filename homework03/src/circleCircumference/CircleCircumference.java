package circleCircumference;

import java.util.Scanner;

public class CircleCircumference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter circle radius: ");
		
		double radius = sc.nextDouble();
		double pi = Math.PI;
		System.out.println(pi);
		double circleCircumference = (radius * 2 * pi);
		System.out.println("Circle circumference is: " + circleCircumference);
		sc.close();
	}

}
