package week2;

import java.util.Scanner;

public class ArrayPeers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //create scanner
		
		String [] peerNames = new String [4]; //declare and creation
		
		//ask for input for first element
		System.out.println("Enter your first peer name.");
		peerNames [0] = input.nextLine();
		
		//ask for input for second element
		System.out.println("Enter your second peer name.");
		peerNames [1] = input.nextLine();
		
		//as for input for third element
		System.out.println("Enter your third peer name.");
		peerNames [2] = input.nextLine();
		
		//ask for input for fourth element		
		System.out.println("Enter your fourth peer name.");
		peerNames [3] = input.nextLine();
		
		//create a string for first element
		String firstName = peerNames [0];
		
		//create a character array and method to make the character an array
		char[] lettersFirst = firstName.toCharArray();
		
		//print the first letter of the char array
		System.out.println (lettersFirst [0]);
		
		String secondName = peerNames [1];
		
		char[] lettersSecond = secondName.toCharArray();
		
		System.out.println (lettersSecond [0]);
		
		String thirdName = peerNames [2];
		
		char[] lettersThird = thirdName.toCharArray();
		
		System.out.println (lettersThird [0]);
		
		String fourthName = peerNames [3];
		
		char[] lettersFourth = fourthName.toCharArray();
		
		System.out.println (lettersFourth [0]);
		
		
	
		
		}

}
