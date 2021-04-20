package exercises.mo4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

import exercises.mo4.GeometricObject;

class GeometricObjectTest {

	@Test
	void testDefault() {
		GeometricObject triangle = new Triangle();
		assertEquals(3, triangle.getPerimeter());
		assertEquals(0.433, triangle.getArea());
		assertEquals("white unfilled triangle: side1 = 1.0 side2 = 1.0 side3 = 1.0", triangle.toString());
	}
	
	@Test
	void testCustom() {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter the length of side1");

	    double side1 = Double.parseDouble(scanner.nextLine());
	    
	    System.out.println("Enter the length of side2");

	    double side2 = Double.parseDouble(scanner.nextLine());
	    
	    System.out.println("Enter the length of side3");

	    double side3 = Double.parseDouble(scanner.nextLine());
	    
	    System.out.println("Enter the color of the triangle");

	    String color = scanner.nextLine();
	    
	    System.out.println("is the triangle filled? true/false");

	    boolean filled = scanner.nextBoolean();

	    scanner.close();
	    
		GeometricObject triangle = new Triangle(side1, side2, side3, color, filled);
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Perimeter: " + triangle.toString());
	}

}
