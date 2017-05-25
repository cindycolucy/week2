package week2;

public class CharArray {

	public static void main(String[] args) {
		
		String myName = "Mr Lindsey";
		char[] letters = myName.toCharArray();

		System.out.println("The first letter of my name is " + letters[0]);
		
		int lengthOfString = myName.length();
		
		int lastIndex = letters.length - 1; //note no ()
		
		System.out.println ("The last letter of my name is " + letters [lastIndex]);
	}
			

}
