package exercises.m02;

import java.util.Scanner;

public class Payroll {
	public static String name;
	public static double weeklyHours;
	public static double hourlyRate;
	public static double fedTax;
	public static double stateTax;
	public static double fedWithheld;
	public static double stateWithheld;
	public static double totalDeducted;
	public static double grossPay;
	public static double netPay;
	
	public static void main(String[] args) {
		getInput();
		calculatePayroll();
		printPayroll();
	}

	
	public static void getInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter employee's name:");
	    name = scanner.nextLine();
		
	    System.out.println("Enter number of hours worked in a week:");
	    weeklyHours = Double.parseDouble(scanner.nextLine());
	    
	    System.out.println("Enter hourly pay rate:");
	    hourlyRate = Double.parseDouble(scanner.nextLine());
	    
	    System.out.println("Enter federal tax withholding rate:");
	    fedTax = Double.parseDouble(scanner.nextLine());
	    
	    System.out.println("Enter federal state withholding rate:");
	    stateTax = Double.parseDouble(scanner.nextLine());
	    scanner.close();
	}
	
	public static void calculatePayroll() {
		grossPay = weeklyHours * hourlyRate;
		fedWithheld = grossPay * (fedTax / 100);
		stateWithheld = grossPay * (stateTax / 100);
		totalDeducted = fedWithheld + stateWithheld;
		netPay = grossPay - totalDeducted;
	}
	
	public static void printPayroll() {
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + weeklyHours);
		System.out.println("Pay Rate: " + hourlyRate);
		System.out.println("Gross Pay: " + grossPay);
		System.out.println("Deductions:");
		System.out.println("	Federal Withholding: (" + fedTax + "%): $" + fedWithheld);
		System.out.println("	State Withholding: (" + stateTax + "%): $" + stateWithheld);
		System.out.println("	Total Deduction: $" + totalDeducted);
		System.out.println("Net Pay: $" + netPay);
	}
}
