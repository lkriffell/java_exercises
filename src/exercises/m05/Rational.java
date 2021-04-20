package exercises.m05;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Rational {
	public static BigInteger numOneNumerator;
	public static BigInteger numOneDenominator;
	public static BigInteger numTwoNumerator;
	public static BigInteger numTwoDenominator;
	public static BigInteger finalDenominator;
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first rational number: ");
		String[] nums = input.nextLine().split(" ");
		numOneNumerator = new BigInteger(nums[0]);
		numOneDenominator = new BigInteger(nums[1]);
		System.out.println("Enter the second rational number: ");
		nums = input.nextLine().split(" ");
		numTwoNumerator = new BigInteger(nums[0]);
		numTwoDenominator = new BigInteger(nums[1]);
		finalDenominator = numOneDenominator.multiply(numTwoDenominator);
		plus();
		minus();
		times();
		division();
		numTwo();
	}
	
	public static void plus() {
		BigInteger finalNumerator = (numOneNumerator.multiply(numTwoDenominator)).add(numTwoNumerator.multiply(numOneDenominator));
		System.out.println(numOneNumerator + "/" + numOneDenominator + " + " + numTwoNumerator + "/" + numTwoDenominator + " = " + finalNumerator + "/" + finalDenominator);
	}
	
	public static void minus() {
		BigInteger finalNumerator = (numOneNumerator.multiply(numTwoDenominator)).subtract(numTwoNumerator.multiply(numOneDenominator));
		System.out.println(numOneNumerator + "/" + numOneDenominator + " - " + numTwoNumerator + "/" + numTwoDenominator + " = " + finalNumerator + "/" + finalDenominator);
	}
	
	public static void times() {
		BigInteger finalNumerator = (numOneNumerator.multiply(numTwoNumerator));
		System.out.println(numOneNumerator + "/" + numOneDenominator + " * " + numTwoNumerator + "/" + numTwoDenominator + " = " + finalNumerator + "/" + finalDenominator);
	}
	
	public static void division() {
		BigInteger finalNumerator = (numOneNumerator.multiply(numTwoDenominator));
		BigInteger finalDenominator = (numOneDenominator.multiply(numTwoNumerator));
		System.out.println(numOneNumerator + "/" + numOneDenominator + " / " + numTwoNumerator + "/" + numTwoDenominator + " = " + finalNumerator + "/" + finalDenominator);
	}
	
	public static void numTwo() {
		BigDecimal decimalNumerator = new BigDecimal(numTwoNumerator);
		BigDecimal decimalDenominator = new BigDecimal(numTwoDenominator);
		BigDecimal finalAnswer = decimalNumerator.divide(decimalDenominator, 19, 1);
		System.out.println(numTwoNumerator + "/" + numTwoDenominator + " is " + finalAnswer);
	}
}
