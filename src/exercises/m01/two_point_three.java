package exercises.m01;

import java.util.Scanner;

public class two_point_three {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter a value for feet:");

	    String feetString = scanner.nextLine();
	    
	    double feetNum = Double.parseDouble(feetString);
	    double meters = feetNum * 0.3048;
	    
	    System.out.println(feetNum + " feet is " + meters + " meters");
	    
	    scanner.close();
	}
}
