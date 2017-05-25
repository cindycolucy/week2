package week2.oop;

public class Calculator2 {

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

	int pushEquals() {
	switch (operation) {

	case '+':
		currentNumber = previousNumber + currentNumber;
	break;
	case '-': 
		currentNumber = previousNumber - currentNumber;
	break;
	case '*': 
		currentNumber = previousNumber * currentNumber;
	break;
	case '/': 
		currentNumber = previousNumber / currentNumber;
	break;	

	
	}
	

		return currentNumber;

	}

}
