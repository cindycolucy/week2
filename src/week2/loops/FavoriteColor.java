package week2.loops;

import java.util.Scanner;

public class FavoriteColor {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			  System.out.println("What is your favorite color?"); 
			  String favoriteColor = input.nextLine();

			  if(favoriteColor.equals("Blue")) {
			    System.out.println("You're just making Monty Python references.");
			    System.out.println("Get out!");
			    break;
			  }

			  System.out.println("Your favorite color is " + favoriteColor);
			}

	}

}
