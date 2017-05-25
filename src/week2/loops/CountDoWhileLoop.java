package week2.loops;

public class CountDoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 1;
		while (count < 11) {
			System.out.println("The count is " + count);
			count++;

		}

		System.out.println("With do/while:");
		count = 1;
		do {
			System.out.println("The count is " + count);
			count++;
		} while (count < 11);

	}
}
