package exercises.m01;

import java.util.Random;
import java.util.Scanner;

public class Lottery {
	static Random random = new Random();
	private static int num1 = random.nextInt(10);
	private static int num2 = random.nextInt(10);
	private static int num3 = random.nextInt(10);
	private static int[] winningNum = {num1, num2, num3};
	public static int[] lottoNum = {0, 0, 0};
	
	public static void main(String[] args) {
	    getInput();
	    
	    int correctNums = correctNums();
	    
	    if (winner()) {
	    	System.out.println("Wow! You've won $10,000");
	    } else if (correctNums == 3) {
	    	System.out.println("Your numbers were correct but in the wrong order. You've won $3,000");
    	} else if (correctNums == 1 || correctNums == 2) {
    		System.out.println(correctNums + " number(s) matches. You've won $1,000");
    	} else {
    		System.out.println("You lose :(");
    	}
	    
	}
	
	public static void getInput() {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter a 3 digit lottery number:");

	    String[] newTicket = scanner.nextLine().split("");
	    
	    for (int i = 0; i < 3; i++) {
	    	lottoNum[i] = Integer.parseInt(newTicket[i]);
		}
	    
	    scanner.close();
	}
	
	public static boolean winner() {
		return winningNum[0] == lottoNum[0] && winningNum[1] == lottoNum[1] && winningNum[2] == lottoNum[2];
	}
	
	public static int correctNums() {
		int numsCorrect = 0;
		for (int i = 0; i < 3; i++) {
			if (lottoNum[0] == winningNum[i]) {
				numsCorrect++;
			} else if (lottoNum[1] == winningNum[i]) {
				numsCorrect++;
			} else if (lottoNum[2] == winningNum[i]) {
				numsCorrect++;
			}
		}
		return numsCorrect;
	}
	
}
