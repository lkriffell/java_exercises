package exercises.m06;

import java.lang.reflect.Array;
import java.util.Scanner;

public class MaximumElement {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a list of numbers separated by a space: ");
		String[] stringNumbers = input.nextLine().split(" ");
		Comparable[] numbers = new Comparable[stringNumbers.length];
		for(int i = 0; i < stringNumbers.length; i++) {
			numbers[i] = Double.parseDouble(stringNumbers[i]);
		}
		
		System.out.println(max(numbers));
	}
	
	public static <E extends Comparable<E>> E max(E[] list) {
		E currentMax = null;
		
		for(E num : list) {
			if (currentMax == null) {
				currentMax = num;
			}
			if (currentMax.compareTo(num) == -1) {
				
				currentMax = num;
			}
		}
		return currentMax;
	}
}
