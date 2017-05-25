package week2;

import java.util.Scanner;

public class IsItALetter {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a word.");
		String word = input.nextLine();
		word = word.toLowerCase();

		System.out.println("Enter a letter.");
		String letter = input.nextLine();
		letter = letter.toLowerCase();

		if (word.contains(letter)) {
			System.out.println("The word contains the letter");
		} else {
			System.out.println("The word does not contain the letter");

		}

	}

}
