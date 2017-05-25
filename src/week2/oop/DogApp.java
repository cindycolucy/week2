package week2.oop;

import java.util.Scanner;

public class DogApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
				
		Dog fido = new Dog();
		
		fido.name = "Fido";
		writeLine ("Her name is " + fido.name);
				
		writeLine (fido.name + " has " + fido.numberOfLegs + " legs");
		
		fido.numberOfLegs = 4;
		
		writeLine (fido.name + " has " + fido.numberOfLegs + " legs");
		
		//Fido runs away and ends up in a shelter 
		//When Fido gets adopted...
		
		fido.rename("Hope");
		
		writeLine ("Her name is now " + fido.name);

		fido.speak();

		fido.bark();
		
		Dog myOtherDog = new Dog();
		myOtherDog.name = "Krusty";
		
		writeLine("My other dog's name is " + myOtherDog.name);
		myOtherDog.speak();
		
		//tell all the dogs to bark
		
		Dog[] myDogs = {fido, myOtherDog};
		for (Dog currentDog: myDogs){//could have: for(int index = 0; index < myDogs.length; index++)
			currentDog.speak();
			
		}
		
	}//closing bracket for main

	public static void writeLine(String message) {
		System.out.println(message);
	}
}
