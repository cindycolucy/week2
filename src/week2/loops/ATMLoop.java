package week2.loops;

import java.util.Scanner;

public class ATMLoop {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String PIN = "1234";

		String guess;

		int limit = 0;

		do {
			limit++;

			System.out.println("Enter your PIN ");
			guess = input.next();
			
			if (limit == 3) {
				System.out.println("Too many attempts! ");
				break;
			}

			if (!guess.equals(PIN)) {
				System.out.println("Wrong, guess again! ");
			} else {
				System.out.println("You are correct! ");
			}
			
		} while (!guess.equals(PIN));

	}
}
