package areaOfTriangle;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Please, enter A side of a triangle: ");
			double a = sc.nextDouble();			
			System.out.print("Please, enter B side of a triangle: ");
			double b = sc.nextDouble();			
			System.out.print("Please, enter C side of a triangle: ");
			double c = sc.nextDouble();			

			double p = (a + b + c) / 2; 
			double sqrtBase = p * (p - a) * (p -b)* (p-c); 
			double triangleArea = Math.sqrt(sqrtBase);
			System.out.println("Triangle area is: " + triangleArea);
			
	}

}
