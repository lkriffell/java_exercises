package exercises.m03;

import java.util.Scanner;

public class GradeScorer {
	static String[] scores;
	static int highestScore = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of students:");
	    int students = Integer.parseInt(scanner.nextLine());
	    
	    System.out.println("Enter " + students + " scores:");
	    scores = scanner.nextLine().split(" ");
		
	    scanner.close();
	    
	    for(int i = 0; i < students; i++) {
	    	int score = Integer.parseInt(scores[i]);
	    	if (score > highestScore) {
	    		highestScore = score;
	    	}
	    }
	    
	    calculateGrades();
	}
	
	public static void calculateGrades() {
		for(int i = 0; i < scores.length; i++) {
			int score =  Integer.parseInt(scores[i]);
			int pointsOff = score - highestScore;
			if (pointsOff == 0) {
				System.out.println("student " + i + "'s score is " + score + " and grade is A");
			} else if (-10 <= pointsOff && pointsOff <= 0) {
				System.out.println("student " + i + "'s score is " + score + " and grade is A");
			} else if (-20 <= pointsOff && pointsOff <= -10) {
				System.out.println("student " + i + "'s score is " + score + " and grade is B");
			} else if (-30 <= pointsOff && pointsOff <= -20) {
				System.out.println("student " + i + "'s score is " + score + " and grade is C");
			} else if (-40 <= pointsOff && pointsOff <= -30) {
				System.out.println("student " + i + "'s score is " + score + " and grade is D");
			} else {
				System.out.println("student " + i + "'s score is " + score + " and grade is F");
			}
		}
	}
}
