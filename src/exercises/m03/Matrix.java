package exercises.m03;

import java.util.Scanner;

public class Matrix {
	public static String[][] matrix = new String[4][4];
	public static int total = 0;
	
	public static void main(String[] args) {
		setMatrix();
		calculateMajorDiagonal();
		System.out.println("The major diagonal is " + total);
	}
	
	
	
	public static void setMatrix() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first row of the 4x4 matrix:");
	    matrix[0] = scanner.nextLine().split(" ");
	    
	    System.out.println("Enter the second row of the 4x4 matrix:");
	    matrix[1] = scanner.nextLine().split(" ");
	    
	    System.out.println("Enter the third row of the 4x4 matrix:");
	    matrix[2] = scanner.nextLine().split(" ");
	    
	    System.out.println("Enter the fourth row of the 4x4 matrix:");
	    matrix[3] = scanner.nextLine().split(" ");
	    
	    scanner.close();
	}
	
	public static void calculateMajorDiagonal() {
		for(int i = 0; i < 4; i++) {
			total += Integer.parseInt(matrix[i][i]);
		}	
	}
}
