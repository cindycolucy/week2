package week2;

public class ChangingArraySize {

	public static void main(String[] args) {
		
		int [] array = { 42, 86, 23 };
		
		System.out.println (array [1]);
		
		array = new int [5];
		
		System.out.println("after: " + array[1]);
		
		System.out.println("My array as a string is " + array);
	}

}
