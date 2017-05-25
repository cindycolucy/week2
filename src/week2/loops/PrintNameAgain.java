package week2.loops;

import java.util.Scanner;

public class PrintNameAgain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println ("Enter your name: ");
		String message = input.nextLine();
		
		int count = 1;
		while (count <= 5) {
			System.out.println(message);
			count++;
			
			
			
			
		}
	}

}
