package week2.loops;

import java.util.Scanner;

public class MessageLoop {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter a message ");
		
		String message = input.nextLine();
		
		int count = 1;
		
		while (count <= 5){
			System.out.println (message);
			count++;
		}

	}

}
