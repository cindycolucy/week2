package week2.loops;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int secretNumber = 11;
		
		int guess;
		
		do {
			System.out.println("Pick a number: ");
		
			guess = input.nextInt();
			
			if (guess == secretNumber) {
				System.out.println("Correct! ");
						
			} else {
				System.out.println("Wrong! ");
						
			}

		} while (guess != secretNumber);

	}
}
