package week2;

public class IndexOfMethod {

	public static void main(String[] args) {
		
		String myName = "Sue";
		char[] letters = myName.toCharArray();

		System.out.println("The first letter of my name is " + letters[0]);
		
		System.out.println(myName.indexOf('S'));

	}

}
