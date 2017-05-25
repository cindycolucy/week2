package week2.loops;

import java.util.Scanner;

public class IntegerLoop2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a number. ");

		int number1 = input.nextInt();

		System.out.println("Please enter a higher number. ");

		int number2 = input.nextInt();

		int i = number1;

		int sum = 0;

		if (i > number2) {

			System.out.println("Incorrect numbers! ");
			System.exit(0);
		}

		while (i <= number2) {
			sum = sum + i++;
		}
		System.out.println("The sum is " + sum);

	}

}