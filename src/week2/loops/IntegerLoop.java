package week2.loops;

import java.util.Scanner;

public class IntegerLoop {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number. ");
		
		int number = input.nextInt();
		
		int sum = 0;
		
		int i = 0;
		
		//while number <= what the user entered, add numbers

		while (i <= number) {
			sum = sum + i++;
	
		}

		System.out.println("The sum is " + sum);
				
		
				
		

	}

}
