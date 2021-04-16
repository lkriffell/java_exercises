package exercises.m02;

import java.util.Scanner;

public class Pentagon {
	public static double radius;
	public static double side;
	public static double area;
	
	public static void main(String[] args) {
		getInput();
		calculateSide();
		calculateArea();
		System.out.println("The area is " + area);
	}
	
	public static void calculateArea() {
		area = (5 * side * side) / (4 * Math.tan(Math.PI / 5));
	}
	
	public static void getInput() {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter a the radius the the pentagon to find the area");

	    radius = Double.parseDouble(scanner.nextLine());
	    
	    scanner.close();
	}
	
	public static void calculateSide() {
		side = 2 * radius * Math.sin(Math.PI / 5);
	}
}
