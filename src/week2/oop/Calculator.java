package week2.oop;

public class Calculator {

	// method called pushNumbers

	int previousNumber;
	int currentNumber;
	char operation;

	int pushNumbers(int number) {
		previousNumber = currentNumber;
		currentNumber = number;
		return currentNumber;

	}

	void pushAdd() {
		operation = '+';

	}

	void pushMinus() {
		operation = '-';
	}
	void pushMult() {
		operation = '*';
	}
	void pushDivide() {
		operation = '/';
	}

	int pushEquals(){
		if (operation == '+') {
			currentNumber = previousNumber + currentNumber;
		} else if (operation == '-')  { 
			currentNumber = previousNumber - currentNumber;
			
		} else if (operation == '*')  { 
			currentNumber = previousNumber * currentNumber;
		
		} else {
			currentNumber = previousNumber / currentNumber;
		}

		return currentNumber;

	}

}
