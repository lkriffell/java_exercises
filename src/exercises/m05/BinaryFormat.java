package exercises.m05;

import java.util.Scanner;

public class BinaryFormat {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a binary number: ");
		String binaryString = input.nextLine();
		char[] charList = binaryString.toCharArray();
		boolean binary = true;
		for (char ch : charList) {
			if (ch != '0' && ch != '1') {
				binary = false;
				System.out.print("BinaryFormatException: " + binaryString + " is not a binary string");
				break;
			} 
		}
		if (binary == true) {
			System.out.print(binaryString + " is a binary string");
		}
	}
}
