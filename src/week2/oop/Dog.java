package week2.oop;

public class Dog {
	String name;//defaults to null bc string is an object
	int numberOfLegs = 5;//setting a default for number of legs
	
	void rename(String newName){
		name = newName;
		
	}
	void speak(){
		bark();
		System.out.println("My name is " + name);
	}
	void bark(){
		System.out.println("Ruff");
	}
}

