package week2.loops;

import java.util.Scanner;

public class MessageLoopFor {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter a message ");
		
		String message = input.nextLine();
		
		for (int count = 1; count <= 5; count++) {
			System.out.println (message);
			
		}

	}

}
