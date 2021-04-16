package exercises.m03;

import java.util.Scanner;

public class MatrixTest extends Matrix {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your expectation of the total of the major diagonal:");
	    int total = Integer.parseInt(scanner.nextLine());
	    
		Matrix matrix = new Matrix();
		matrix.setMatrix();
		matrix.calculateMajorDiagonal();
		
		if (matrix.total == total) {
			System.out.println("total is " + matrix.total);
			System.out.println("Pass!");
		} else {
			System.out.println("total is " + matrix.total);
			System.out.println("Fail!");
		}
	}
}
