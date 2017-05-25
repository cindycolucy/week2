package week2;

public class TwoDelimSplit {

	public static void main(String[] args) {
		
String pets = "dog-cat,fish";
		
		String[] elements = pets.split(",|\\-");
		//or you could do
		//String[] elements = pets.split("[,-]");
		
		System.out.println(elements[0]);
		System.out.println(elements[1]);
		System.out.println(elements[2]);
		
		

	}

}
