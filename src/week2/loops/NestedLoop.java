package week2.loops;

public class NestedLoop {

	public static void main(String[] args) {
		
		for (int hours = 1; hours < 3; hours++) {
			  for (int minutes = 0; minutes < 60; minutes += 5) {
			    System.out.println("The time is " + hours + ":" + minutes);
			  }
			}

	}
}

