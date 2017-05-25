package week2.loops;

public class ForLoopsWithArray {

	public static void main(String[] args) {

		String[] royGBivColors = { "Red", "Orange", "Yellow" };

		for (int index = 0; index < royGBivColors.length; index++) {
			System.out.println("The index is " + index);
			System.out.println("The color is " + royGBivColors[index]);
		}
		// if I only need to do something with every element in my array
		// enhanced for or for/each
		for (String color : royGBivColors) {
			System.out.println("The color is " + color);
		}

		char[] alphabet = { 'a', 'b', 'c' };
		for (char letter : alphabet) {
			System.out.println(letter);
		}
	}

}
