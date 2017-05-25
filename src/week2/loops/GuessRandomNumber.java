package week2.loops;

import java.util.Random;
import java.util.Scanner;

public class GuessRandomNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Random generator = new Random();
		
		int secretNumber = generator.nextInt(100) +1;
		
		System.out.println("The secret number is " + secretNumber);
		
		int guess;
		
		do {
			System.out.println("Pick a number 1 to 100: ");
		
			guess = input.nextInt();
			
			if (guess == secretNumber) {
				System.out.println("Correct! ");
						
			} else {
				System.out.println("Wrong! ");
						
			}

		} while (guess != secretNumber);

	}
}
